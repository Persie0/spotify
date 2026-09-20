package com.spotify.legacyglue.gluelib.components.toolbar;

import android.view.MenuItem;
import android.view.View;
import p204p.ji10;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public interface GlueToolbar extends ji10 {
    void addOverflowItem(MenuItem menuItem);

    void addView(ToolbarSide toolbarSide, View view, int i);

    void clear(ToolbarSide toolbarSide);

    View findView(int i);

    CharSequence getTitle();

    @Override // p204p.clc1
    /* synthetic */ View getView();

    void setBackgroundColor(int i);

    void setSubtitle(CharSequence charSequence);

    void setTitle(CharSequence charSequence);

    void setTitleAlpha(float f);
}
