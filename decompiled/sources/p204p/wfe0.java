package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class wfe0 {

    /* JADX INFO: renamed from: a */
    public final String f250823a;

    /* JADX INFO: renamed from: b */
    public final String f250824b;

    /* JADX INFO: renamed from: c */
    public final int f250825c;

    /* JADX INFO: renamed from: d */
    public final String f250826d;

    /* JADX INFO: renamed from: e */
    public final String f250827e;

    /* JADX INFO: renamed from: f */
    public final byte[] f250828f;

    /* JADX INFO: renamed from: g */
    public final jk11 f250829g;

    public wfe0(String str, String str2, int i, String str3, String str4, byte[] bArr, jk11 jk11Var) {
        this.f250823a = str;
        this.f250824b = str2;
        this.f250825c = i;
        this.f250826d = str3;
        this.f250827e = str4;
        this.f250828f = bArr;
        this.f250829g = jk11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfe0)) {
            return false;
        }
        wfe0 wfe0Var = (wfe0) obj;
        return wj50.m88271j(this.f250823a, wfe0Var.f250823a) && wj50.m88271j(this.f250824b, wfe0Var.f250824b) && this.f250825c == wfe0Var.f250825c && wj50.m88271j(this.f250826d, wfe0Var.f250826d) && wj50.m88271j(this.f250827e, wfe0Var.f250827e) && wj50.m88271j(this.f250828f, wfe0Var.f250828f) && wj50.m88271j(this.f250829g, wfe0Var.f250829g);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(mt60.m62800g(this.f250825c, s571.m77243b(this.f250823a.hashCode() * 31, 31, this.f250824b), 31), 31, this.f250826d), 31, this.f250827e);
        byte[] bArr = this.f250828f;
        int iHashCode = (iM77243b + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        jk11 jk11Var = this.f250829g;
        return iHashCode + (jk11Var != null ? jk11Var.hashCode() : 0);
    }
}
