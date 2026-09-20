package com.spotify.watchfeed.uiusecases.element.mediaitemsframelayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.c3u0;
import p204p.cgd0;
import p204p.wl51;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, m24212d2 = {"Lcom/spotify/watchfeed/uiusecases/element/mediaitemsframelayout/MediaItemsFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "p/cgd0", "src_main_java_com_spotify_watchfeed_uiusecases_element_mediaitemsframelayout-mediaitemsframelayout"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class MediaItemsFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final float f6930a;

    /* JADX INFO: renamed from: b */
    public final float f6931b;

    /* JADX INFO: renamed from: c */
    public final int f6932c;

    public MediaItemsFrameLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = (int) (size * this.f6930a);
        int i4 = (int) (size2 * this.f6931b);
        int childCount = getChildCount();
        int measuredWidth = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            String str = ((cgd0) childAt.getLayoutParams()).f37640a;
            if (wl51.m88496t0(str, ":", false)) {
                List listM88477a1 = wl51.m88477a1(str, new String[]{":"}, 0, 6);
                f = Float.parseFloat((String) listM88477a1.get(0)) / Float.parseFloat((String) listM88477a1.get(1));
            } else {
                f = 1.0f;
            }
            int i7 = (int) (i4 * f);
            if (i7 > i3) {
                i7 = i3;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (i7 / f), 1073741824));
            int measuredHeight = (this.f6932c * i6) + childAt.getMeasuredHeight();
            if (measuredHeight > i5) {
                i5 = measuredHeight;
            }
            measuredWidth += childAt.getMeasuredWidth();
        }
        setMeasuredDimension(Math.min(measuredWidth, size), Math.min(i5, size2));
    }

    public MediaItemsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        cgd0 cgd0Var = new cgd0(-1, -1);
        cgd0Var.f37640a = "";
        return cgd0Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        cgd0 cgd0Var = new cgd0(getContext(), attributeSet);
        cgd0Var.f37640a = "";
        return cgd0Var;
    }

    public MediaItemsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6930a = 1.0f;
        this.f6931b = 1.0f;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c3u0.f33764a);
            this.f6930a = typedArrayObtainStyledAttributes.getFloat(2, 1.0f);
            this.f6931b = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
            this.f6932c = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        cgd0 cgd0Var = new cgd0(layoutParams);
        cgd0Var.f37640a = "";
        return cgd0Var;
    }

    public /* synthetic */ MediaItemsFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
