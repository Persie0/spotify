package p204p;

import android.util.Base64;

/* JADX INFO: loaded from: classes5.dex */
public final class ka80 {

    /* JADX INFO: renamed from: a */
    public final byte[] f120827a;

    public ka80(byte[] bArr) {
        this.f120827a = (byte[]) bArr.clone();
    }

    /* JADX INFO: renamed from: a */
    public final String m55870a() {
        return Base64.encodeToString(this.f120827a, 0);
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m55871b() {
        return (byte[]) this.f120827a.clone();
    }

    public ka80(String str) {
        this(Base64.decode(str, 0));
    }
}
