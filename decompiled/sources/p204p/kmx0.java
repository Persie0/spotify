package p204p;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes8.dex */
public final class kmx0 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public final float f124235a;

    /* JADX INFO: renamed from: b */
    public final float f124236b;

    /* JADX INFO: renamed from: c */
    public final float f124237c;

    /* JADX INFO: renamed from: d */
    public final float f124238d;

    public kmx0(float f, float f2, float f3, float f4) {
        this.f124235a = f;
        this.f124236b = f2;
        this.f124237c = f3;
        this.f124238d = f4;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i = Build.VERSION.SDK_INT;
        float f = this.f124238d;
        float f2 = this.f124237c;
        float f3 = this.f124236b;
        float fMax = this.f124235a;
        if (i >= 33) {
            Path path = new Path();
            path.addRoundRect(new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight()), new float[]{fMax, fMax, f3, f3, f2, f2, f, f}, Path.Direction.CW);
            outline.setPath(path);
        } else {
            Rect rect = new Rect(0, 0, view.getWidth(), view.getHeight());
            float[] fArr = {f3, f2, f};
            for (int i2 = 0; i2 < 3; i2++) {
                fMax = Math.max(fMax, fArr[i2]);
            }
            outline.setRoundRect(rect, fMax);
        }
    }
}
