package com.spotify.mainlayout.p106ui.view.containers;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import p204p.pc0;
import p204p.qr60;
import p204p.spi0;
import p204p.y2u0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R+\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m24212d2 = {"Lcom/spotify/mainlayout/ui/view/containers/MainLayoutConstrainedContainerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "<set-?>", "b", "Ljava/lang/Object;", "getPercentageWidth", "()F", "setPercentageWidth", "(F)V", "percentageWidth", "src_main_java_com_spotify_mainlayout_ui_view-view"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class MainLayoutConstrainedContainerView extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ qr60[] f5407c = {new spi0(MainLayoutConstrainedContainerView.class, "percentageWidth", "getPercentageWidth()F", 0)};

    /* JADX INFO: renamed from: a */
    public final int f5408a;

    /* JADX INFO: renamed from: b */
    public final pc0 f5409b;

    public MainLayoutConstrainedContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5409b = new pc0(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y2u0.f268680b, 0, 0);
        this.f5408a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, this.f5408a);
        setPercentageWidth(typedArrayObtainStyledAttributes.getFloat(1, getPercentageWidth()));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final float getPercentageWidth() {
        qr60 qr60Var = f5407c[0];
        return ((Number) this.f5409b.f61172a).floatValue();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int percentageWidth = (int) (getPercentageWidth() * size);
        int i3 = this.f5408a;
        if (percentageWidth < i3) {
            percentageWidth = i3;
        }
        if (percentageWidth <= size) {
            size = percentageWidth;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
    }

    public final void setPercentageWidth(float f) {
        this.f5409b.m39516c(f5407c[0], this, Float.valueOf(f));
    }
}
