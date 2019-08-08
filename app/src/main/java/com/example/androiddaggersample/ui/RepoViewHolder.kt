package com.example.androiddaggersample.ui

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.androiddaggersample.repository.data.Repo
import kotlinx.android.synthetic.main.repo_view.view.*

class RepoViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    fun bind(repo: Repo?) {
        repo?.let {
            view.text_name.text = it.full_name
            view.text_language.text = it.language
        }
    }
}