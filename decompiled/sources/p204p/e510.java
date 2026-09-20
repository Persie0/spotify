package p204p;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class e510 extends sz30 {

    /* JADX INFO: renamed from: b */
    public final String f56224b;

    /* JADX INFO: renamed from: c */
    public final String f56225c;

    /* JADX INFO: renamed from: d */
    public final String f56226d;

    /* JADX INFO: renamed from: e */
    public final byte[] f56227e;

    public e510(String str, String str2, byte[] bArr, String str3) {
        super("GEOB");
        this.f56224b = str;
        this.f56225c = str2;
        this.f56226d = str3;
        this.f56227e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e510.class == obj.getClass()) {
            e510 e510Var = (e510) obj;
            if (Objects.equals(this.f56224b, e510Var.f56224b) && Objects.equals(this.f56225c, e510Var.f56225c) && Objects.equals(this.f56226d, e510Var.f56226d) && Arrays.equals(this.f56227e, e510Var.f56227e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f56224b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f56225c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f56226d;
        return Arrays.hashCode(this.f56227e) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // p204p.sz30
    public final String toString() {
        return this.f215378a + ": mimeType=" + this.f56224b + ", filename=" + this.f56225c + ", description=" + this.f56226d;
    }
}
