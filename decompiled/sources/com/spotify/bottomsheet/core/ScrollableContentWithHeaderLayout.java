package com.spotify.bottomsheet.core;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Iterator;
import kotlin.Metadata;
import p204p.btz0;
import p204p.ek5;
import p204p.m1u0;
import p204p.pc0;
import p204p.qr60;
import p204p.qsz0;
import p204p.spi0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m24211d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m24212d2 = {"Lcom/spotify/bottomsheet/core/ScrollableContentWithHeaderLayout;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "a", "I", "getContentChildIndex", "()I", "setContentChildIndex", "(I)V", "contentChildIndex", "", "<set-?>", "b", "Ljava/lang/Object;", "isDraggingHeader", "()Z", "setDraggingHeader", "(Z)V", "Lp/qsz0;", "Landroid/view/View;", "getContentChildren", "()Lp/qsz0;", "contentChildren", "src_main_java_com_spotify_bottomsheet_core-core"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ScrollableContentWithHeaderLayout extends LinearLayout {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ qr60[] f3107c = {new spi0(ScrollableContentWithHeaderLayout.class, "isDraggingHeader", "isDraggingHeader()Z", 0)};

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int contentChildIndex;

    /* JADX INFO: renamed from: b */
    public final pc0 f3109b;

    public ScrollableContentWithHeaderLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.contentChildIndex = 1;
        this.f3109b = new pc0(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m1u0.f139096a, 0, 0);
        this.contentChildIndex = typedArrayObtainStyledAttributes.getInteger(0, this.contentChildIndex);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qsz0 getContentChildren() {
        return btz0.m30479C(new ek5(this, 8), this.contentChildIndex);
    }

    private final void setDraggingHeader(boolean z) {
        this.f3109b.m39516c(f3107c[0], this, Boolean.valueOf(z));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object next;
        int action = motionEvent.getAction();
        if (action == 0) {
            Iterator it = getContentChildren().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((View) next).getVisibility() == 8);
            View view = (View) next;
            if (view != null) {
                setDraggingHeader(motionEvent.getY() <= ((float) view.getTop()));
            }
        } else if (action == 1 || action == 3) {
            setDraggingHeader(false);
        }
        qr60 qr60Var = f3107c[0];
        return ((Boolean) this.f3109b.f61172a).booleanValue() || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        qr60 qr60Var = f3107c[0];
        if (!((Boolean) this.f3109b.f61172a).booleanValue()) {
            return super.drawChild(canvas, view, j);
        }
        float f = -view.getTranslationY();
        int iSave = canvas.save();
        canvas.translate(0.0f, f);
        try {
            return super.drawChild(canvas, view, j);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public final int getContentChildIndex() {
        return this.contentChildIndex;
    }

    public final void setContentChildIndex(int i) {
        this.contentChildIndex = i;
    }
}
