package com.example.prrr18

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


class DetailFragment : Fragment() {

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            return inflater.inflate(R.layout.fragment_detail, container, false)
        }
        // обновление текстового поля
        fun setSelectedItem(selectedItem: String?) {
            val view = view?.findViewById<TextView>(R.id.detailsText)
            view?.text = selectedItem
            val image = requireView().findViewById<ImageView>(R.id.imageView)
            val kt = R.drawable.korgi
            val kt1 = R.drawable.shpiz
            val kt2 = R.drawable.haski
            if (selectedItem == "Шпиц") {
                image.setImageResource(kt1)
                view?.text = "Шпиц-декоративная собака, которая отличается пропорциональностью и относительно длинными конечностями."
            }
            if (selectedItem == "Хаски") {
                image.setImageResource(kt2)
                view?.text = "Сибирский хаски-это порода рабочих ездовых собак среднего размера. Порода относится к генетическому семейству шпицев. "
            }
            if (selectedItem == "Корги") {
                image.setImageResource(kt)
                view?.text = "Породы пастушьих собак, происходящие из Уэльса. "
            }
        }

}