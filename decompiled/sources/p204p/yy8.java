package p204p;

import android.widget.ImageView;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class yy8 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f277440a;

    static {
        int[] iArr = new int[ImageView.ScaleType.values().length];
        try {
            iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ImageView.ScaleType.MATRIX.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f277440a = iArr;
    }
}
