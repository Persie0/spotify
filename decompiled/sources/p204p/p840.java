package p204p;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class p840 {

    /* JADX INFO: renamed from: a */
    public final List f174861a;

    /* JADX INFO: renamed from: b */
    public final Set f174862b;

    /* JADX INFO: renamed from: c */
    public final String f174863c;

    /* JADX INFO: renamed from: d */
    public final byte[] f174864d;

    public p840(List list, Set set, String str, byte[] bArr) {
        this.f174861a = list;
        this.f174862b = set;
        this.f174863c = str;
        this.f174864d = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p840)) {
            return false;
        }
        p840 p840Var = (p840) obj;
        return wj50.m88271j(this.f174861a, p840Var.f174861a) && wj50.m88271j(this.f174862b, p840Var.f174862b) && wj50.m88271j(this.f174863c, p840Var.f174863c) && wj50.m88271j(this.f174864d, p840Var.f174864d);
    }

    public final int hashCode() {
        int iM56830b = klh.m56830b(this.f174861a.hashCode() * 31, 31, this.f174862b);
        String str = this.f174863c;
        int iHashCode = (iM56830b + (str == null ? 0 : str.hashCode())) * 31;
        byte[] bArr = this.f174864d;
        return iHashCode + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }
}
