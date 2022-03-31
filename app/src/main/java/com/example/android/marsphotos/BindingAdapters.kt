package com.example.android.marsphotos

import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import coil.load

@BindingAdapter("imageSrcUrl")
//binding params 1 komponen, params 2 datanya
fun bindImage(imgView: ImageView, imgSrc: String?) {
    imgSrc?.let {
        val image = imgSrc.toUri().buildUpon().scheme("https").build()
        imgView.load(image) {
            placeholder(R.drawable.loading_animation)
            error(R.drawable.ic_broken_image)
        }
    }
}