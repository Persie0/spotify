package com.spotify.legacyglue.gluelib.components.toolbar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public final class GlueToolbars {
    private GlueToolbars() {
    }

    public static GlueToolbar createGlueToolbar(Context context, ViewGroup viewGroup) {
        return createGlueToolbar((GlueToolbarLayout) LayoutInflater.from(context).inflate(R.layout.glue_toolbar, viewGroup, false));
    }

    public static GlueToolbar createGlueToolbar(GlueToolbarLayout glueToolbarLayout) {
        return new GlueToolbarImpl(glueToolbarLayout);
    }
}
