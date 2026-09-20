package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class t361 {

    /* JADX INFO: renamed from: a */
    public final byte[] f216711a;

    /* JADX INFO: renamed from: b */
    public final String f216712b;

    public t361(String str, byte[] bArr) {
        this.f216711a = bArr;
        this.f216712b = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m79980a() {
        return this.f216712b;
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m79981b() {
        return this.f216711a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t361)) {
            return false;
        }
        t361 t361Var = (t361) obj;
        return Arrays.equals(this.f216711a, t361Var.f216711a) && wj50.m88271j(this.f216712b, t361Var.f216712b);
    }

    public final int hashCode() {
        return this.f216712b.hashCode() + (Arrays.hashCode(this.f216711a) * 31);
    }
}
