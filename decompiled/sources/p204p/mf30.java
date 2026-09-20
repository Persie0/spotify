package p204p;

import android.text.Layout;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class mf30 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f142943a;

    static {
        int[] iArr = new int[Layout.Alignment.values().length];
        try {
            iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f142943a = iArr;
    }
}
