package p204p;

import java.net.Proxy;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class yti {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f276126a;

    static {
        int[] iArr = new int[Proxy.Type.values().length];
        try {
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f276126a = iArr;
    }
}
