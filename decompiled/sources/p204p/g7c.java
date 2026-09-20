package p204p;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes7.dex */
public final class g7c extends il80 {

    /* JADX INFO: renamed from: p */
    public final int f77240p;

    public g7c(Context context, int i) {
        super(context);
        this.f77240p = i;
    }

    @Override // p204p.il80
    /* JADX INFO: renamed from: a */
    public final int mo43803a(int i, int i2, int i3, int i4, int i5) {
        return ((((i4 - i3) - (i2 - i)) / 2) + i3) - i;
    }

    @Override // p204p.il80
    /* JADX INFO: renamed from: b */
    public final float mo34955b(DisplayMetrics displayMetrics) {
        return super.mo34955b(displayMetrics) * 2.0f;
    }

    @Override // p204p.il80
    /* JADX INFO: renamed from: d */
    public final PointF mo43804d(int i) {
        int iM38547C = edb.m38547C(this.f77240p);
        int i2 = 1;
        if (iM38547C == 1) {
            i2 = -1;
        } else if (iM38547C != 2) {
            i2 = 0;
        }
        return new PointF(i2, 0.0f);
    }
}
