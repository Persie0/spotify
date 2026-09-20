package p204p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class ai9 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f15915a;

    static {
        int[] iArr = new int[Bitmap.CompressFormat.values().length];
        try {
            iArr[Bitmap.CompressFormat.JPEG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f15915a = iArr;
    }
}
