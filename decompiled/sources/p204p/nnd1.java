package p204p;

import android.text.Layout;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class nnd1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f156407a;

    static {
        int[] iArr = new int[Layout.Alignment.values().length];
        f156407a = iArr;
        try {
            iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f156407a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f156407a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
