package com.lopniv.movie.utils

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.renderscript.Allocation
import android.renderscript.Element
import android.renderscript.RenderScript
import android.renderscript.ScriptIntrinsicBlur
import kotlin.math.roundToInt


object BlurBuilder {
    private const val BITMAP_SCALE = 0.4f
    private const val BLUR_RADIUS = 10f
    fun blur(context: Context, imagesList: ArrayList<Int>): ArrayList<Bitmap> {
        val outputImages: ArrayList<Bitmap> = arrayListOf()
        for (item in imagesList){
            val bitmap = BitmapFactory.decodeResource(context.resources, item)
            val width = (bitmap.width * BITMAP_SCALE).roundToInt()
            val height = (bitmap.height * BITMAP_SCALE).roundToInt()
            val inputBitmap = Bitmap.createScaledBitmap(bitmap, width, height, false)
            val outputBitmap = Bitmap.createBitmap(inputBitmap)
            val rs = RenderScript.create(context)
            val theIntrinsic = ScriptIntrinsicBlur.create(rs, Element.U8_4(rs))
            val tmpIn = Allocation.createFromBitmap(rs, inputBitmap)
            val tmpOut = Allocation.createFromBitmap(rs, outputBitmap)
            theIntrinsic.setRadius(BLUR_RADIUS)
            theIntrinsic.setInput(tmpIn)
            theIntrinsic.forEach(tmpOut)
            tmpOut.copyTo(outputBitmap)
            outputImages.add(outputBitmap)
        }
        return outputImages
    }
}