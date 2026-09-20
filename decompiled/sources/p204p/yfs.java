package p204p;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes7.dex */
public abstract class yfs {

    /* JADX INFO: renamed from: a */
    public static final n7f f272325a = new n7f(6);

    /* JADX INFO: renamed from: a */
    public static void m93567a(Drawable drawable, ColorStateList colorStateList, int[] iArr) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (drawable.mutate() == drawable) {
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            if (colorStateList == null || mode == null) {
                porterDuffColorFilter = null;
            } else {
                int colorForState = colorStateList.getColorForState(iArr, 0);
                n7f n7fVar = f272325a;
                n7fVar.getClass();
                int i = (31 + colorForState) * 31;
                porterDuffColorFilter = (PorterDuffColorFilter) n7fVar.m66541c(Integer.valueOf(mode.hashCode() + i));
                if (porterDuffColorFilter == null) {
                    porterDuffColorFilter = new PorterDuffColorFilter(colorForState, mode);
                }
            }
            drawable.setColorFilter(porterDuffColorFilter);
            drawable.invalidateSelf();
        }
    }
}
