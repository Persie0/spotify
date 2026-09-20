package p204p;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class a441 {
    /* JADX INFO: renamed from: a */
    public static Rect m24663a(y341 y341Var) {
        Parcelable parcelable;
        Bundle bundle = y341Var.f98701f;
        if (bundle != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) bundle.getParcelable("anchorRect", Rect.class);
            } else {
                Parcelable parcelable2 = bundle.getParcelable("anchorRect");
                if (!(parcelable2 instanceof Rect)) {
                    parcelable2 = null;
                }
                parcelable = (Rect) parcelable2;
            }
            Rect rect = (Rect) parcelable;
            if (rect != null) {
                return rect;
            }
        }
        return new Rect();
    }
}
