package com.spotify.adsinternal.playback.video;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.i1u0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m24212d2 = {"Lcom/spotify/adsinternal/playback/video/CountdownBarView;", "Landroid/widget/ProgressBar;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_adsinternal_playback-playback"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class CountdownBarView extends ProgressBar {

    /* JADX INFO: renamed from: a */
    public AnimatorSet f2729a;

    public CountdownBarView(Context context) {
        this(context, null, 0, 6, null);
    }

    public CountdownBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CountdownBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setMax(200);
        setScaleX(-1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i1u0.f97606a, i, 0);
        setProgressTintList(ColorStateList.valueOf(typedArrayObtainStyledAttributes.getColor(0, context.getColor(R.color.white))));
        setProgressBackgroundTintList(ColorStateList.valueOf(0));
        typedArrayObtainStyledAttributes.recycle();
    }

    public /* synthetic */ CountdownBarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
