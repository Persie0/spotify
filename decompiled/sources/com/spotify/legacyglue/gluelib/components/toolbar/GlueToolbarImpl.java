package com.spotify.legacyglue.gluelib.components.toolbar;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import java.util.WeakHashMap;
import p204p.mec1;

/* JADX INFO: loaded from: classes7.dex */
class GlueToolbarImpl implements GlueToolbar {
    private Drawable mBackgroundDrawable;
    private final TextView mSubtitleTextView;
    private final TextView mTitleView;
    private final GlueToolbarLayout mToolbarView;

    public GlueToolbarImpl(GlueToolbarLayout glueToolbarLayout) {
        this.mToolbarView = glueToolbarLayout;
        this.mTitleView = glueToolbarLayout.getTextView();
        this.mSubtitleTextView = glueToolbarLayout.getSubtitleTextView();
    }

    @Override // com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar
    public void addOverflowItem(MenuItem menuItem) {
        this.mToolbarView.addOverflowItem(menuItem);
    }

    @Override // com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar
    public void addView(ToolbarSide toolbarSide, View view, int i) {
        this.mToolbarView.addView(toolbarSide, view, i);
    }

    @Override // com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar
    public void clear(ToolbarSide toolbarSide) {
        this.mToolbarView.clear(toolbarSide);
    }

    @Override // com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar
    public View findView(int i) {
        return this.mToolbarView.findView(i);
    }

    @Override // com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar
    public CharSequence getTitle() {
        return this.mTitleView.getText();
    }

    @Override // com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar, p204p.clc1
    public View getView() {
        return this.mToolbarView;
    }

    @Override // com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar
    public void setBackgroundColor(int i) {
        ColorDrawable colorDrawable = new ColorDrawable(i);
        this.mBackgroundDrawable = colorDrawable;
        GlueToolbarLayout glueToolbarLayout = this.mToolbarView;
        WeakHashMap weakHashMap = mec1.f142677a;
        glueToolbarLayout.setBackground(colorDrawable);
    }

    @Override // com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar
    public void setSubtitle(CharSequence charSequence) {
        this.mSubtitleTextView.setVisibility(charSequence.length() > 0 ? 0 : 8);
        this.mSubtitleTextView.setText(charSequence);
    }

    @Override // com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar
    public void setTitle(CharSequence charSequence) {
        this.mTitleView.setText(charSequence);
    }

    @Override // com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar
    public void setTitleAlpha(float f) {
        this.mTitleView.setAlpha(f);
    }
}
