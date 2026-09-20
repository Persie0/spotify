package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ofu0 {

    /* JADX INFO: renamed from: a */
    public final boolean f164907a;

    /* JADX INFO: renamed from: b */
    public final String f164908b;

    /* JADX INFO: renamed from: c */
    public final String f164909c;

    /* JADX INFO: renamed from: d */
    public final String f164910d;

    /* JADX INFO: renamed from: e */
    public final List f164911e;

    public ofu0(String str, String str2, boolean z, String str3, List list) {
        this.f164907a = z;
        this.f164908b = str;
        this.f164909c = str2;
        this.f164910d = str3;
        this.f164911e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofu0)) {
            return false;
        }
        ofu0 ofu0Var = (ofu0) obj;
        return this.f164907a == ofu0Var.f164907a && wj50.m88271j(this.f164908b, ofu0Var.f164908b) && wj50.m88271j(this.f164909c, ofu0Var.f164909c) && wj50.m88271j(this.f164910d, ofu0Var.f164910d) && this.f164911e.equals(ofu0Var.f164911e);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f164907a) * 31;
        String str = this.f164908b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f164909c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f164910d;
        return this.f164911e.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
