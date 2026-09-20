package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class pz30 implements s5f0 {

    /* JADX INFO: renamed from: a */
    public final byte[] f183590a;

    /* JADX INFO: renamed from: b */
    public final String f183591b;

    /* JADX INFO: renamed from: c */
    public final String f183592c;

    public pz30(String str, String str2, byte[] bArr) {
        this.f183590a = bArr;
        this.f183591b = str;
        this.f183592c = str2;
    }

    @Override // p204p.s5f0
    /* JADX INFO: renamed from: b */
    public final void mo35404b(nhd0 nhd0Var) {
        String str = this.f183591b;
        if (str != null) {
            nhd0Var.f153964a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pz30.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f183590a, ((pz30) obj).f183590a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f183590a);
    }

    public final String toString() {
        return klh.m56832d(this.f183590a.length, "\"", edb.m38573v("ICY: title=\"", this.f183591b, "\", url=\"", this.f183592c, "\", rawMetadata.length=\""));
    }
}
