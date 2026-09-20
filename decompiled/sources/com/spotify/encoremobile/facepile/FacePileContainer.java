package com.spotify.encoremobile.facepile;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gtq;

/* JADX INFO: loaded from: classes6.dex */
@gtq
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m24212d2 = {"Lcom/spotify/encoremobile/facepile/FacePileContainer;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_encoremobile_facepile-facepile"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class FacePileContainer extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public Path f3807a;

    /* JADX INFO: renamed from: b */
    public float f3808b;

    public FacePileContainer(Context context) {
        this(context, null, 0, 6, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m9679a(float f, float f2, float f3, float f4) {
        this.f3808b = (f * 2.0f) + f3;
        if (f2 <= 0.0f) {
            this.f3807a = null;
            return;
        }
        Path path = new Path();
        path.setFillType(Path.FillType.INVERSE_EVEN_ODD);
        if (f4 >= f) {
            path.addCircle(f, f, f2 + f, Path.Direction.CW);
        } else {
            float f5 = f4 + f2;
            float f6 = -f2;
            float f7 = ((f + f2) * 2.0f) - f2;
            path.addRoundRect(f6, f6, f7, f7, f5, f5, Path.Direction.CW);
        }
        this.f3807a = path;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int iIndexOfChild = indexOfChild(view);
        if (this.f3807a == null || iIndexOfChild <= 0) {
            return super.drawChild(canvas, view, j);
        }
        int iSave = canvas.save();
        try {
            Path path = this.f3807a;
            if (path == null) {
                return false;
            }
            float left = getContext().getResources().getConfiguration().getLayoutDirection() == 1 ? view.getLeft() + this.f3808b : view.getLeft() - this.f3808b;
            canvas.translate(left, 0.0f);
            canvas.clipPath(path);
            canvas.translate(-left, 0.0f);
            return super.drawChild(canvas, view, j);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public FacePileContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public FacePileContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setDuplicateParentStateEnabled(true);
    }

    public /* synthetic */ FacePileContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
