package p204p;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class aut extends iw3 {
    @Override // p204p.iw3
    /* JADX INFO: renamed from: m */
    public final void mo27217m(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float fSin;
        float fCos;
        RectF rectFM51782e = iw3.m51782e(tabLayout, view);
        RectF rectFM51782e2 = iw3.m51782e(tabLayout, view2);
        if (rectFM51782e.left < rectFM51782e2.left) {
            double d = (((double) f) * 3.141592653589793d) / 2.0d;
            fSin = (float) (1.0d - Math.cos(d));
            fCos = (float) Math.sin(d);
        } else {
            double d2 = (((double) f) * 3.141592653589793d) / 2.0d;
            fSin = (float) Math.sin(d2);
            fCos = (float) (1.0d - Math.cos(d2));
        }
        int i = (int) rectFM51782e.left;
        int i2 = (int) rectFM51782e2.left;
        LinearInterpolator linearInterpolator = r05.f194383a;
        int iRound = Math.round(fSin * (i2 - i)) + i;
        int i3 = drawable.getBounds().top;
        int i4 = (int) rectFM51782e.right;
        drawable.setBounds(iRound, i3, Math.round(fCos * (((int) rectFM51782e2.right) - i4)) + i4, drawable.getBounds().bottom);
    }
}
