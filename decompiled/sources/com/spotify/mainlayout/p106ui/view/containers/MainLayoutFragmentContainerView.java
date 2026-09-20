package com.spotify.mainlayout.p106ui.view.containers;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import kotlin.Metadata;
import p204p.gh00;
import p204p.pc0;
import p204p.qr60;
import p204p.spi0;
import p204p.vlb0;
import p204p.y2u0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bR+\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R0\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m24212d2 = {"Lcom/spotify/mainlayout/ui/view/containers/MainLayoutFragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "<set-?>", "a", "Ljava/lang/Object;", "getCornerRadiusTop", "()F", "setCornerRadiusTop", "(F)V", "cornerRadiusTop", "Lkotlin/Function1;", "Landroid/view/WindowInsets;", "b", "Lp/gh00;", "getInsetsTransformer$src_main_java_com_spotify_mainlayout_ui_view_view", "()Lp/gh00;", "setInsetsTransformer$src_main_java_com_spotify_mainlayout_ui_view_view", "(Lp/gh00;)V", "insetsTransformer", "src_main_java_com_spotify_mainlayout_ui_view-view"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class MainLayoutFragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ qr60[] f5420c = {new spi0(MainLayoutFragmentContainerView.class, "cornerRadiusTop", "getCornerRadiusTop()F", 0)};

    /* JADX INFO: renamed from: a */
    public final pc0 f5421a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public gh00 insetsTransformer;

    public MainLayoutFragmentContainerView(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        return super.dispatchApplyWindowInsets((WindowInsets) this.insetsTransformer.invoke(windowInsets));
    }

    public final float getCornerRadiusTop() {
        qr60 qr60Var = f5420c[0];
        return ((Number) this.f5421a.f61172a).floatValue();
    }

    /* JADX INFO: renamed from: getInsetsTransformer$src_main_java_com_spotify_mainlayout_ui_view_view, reason: from getter */
    public final gh00 getInsetsTransformer() {
        return this.insetsTransformer;
    }

    public final void setCornerRadiusTop(float f) {
        this.f5421a.m39516c(f5420c[0], this, Float.valueOf(f));
    }

    /* JADX INFO: renamed from: setInsetsTransformer$src_main_java_com_spotify_mainlayout_ui_view_view */
    public final void m13404xc2149698(gh00 gh00Var) {
        this.insetsTransformer = gh00Var;
    }

    public MainLayoutFragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5421a = new pc0(this);
        this.insetsTransformer = vlb0.f242439b1;
        setClipToOutline(true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y2u0.f268682d, 0, 0);
        setCornerRadiusTop(typedArrayObtainStyledAttributes.getDimension(0, 0.0f));
        typedArrayObtainStyledAttributes.recycle();
    }
}
