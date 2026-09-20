package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class d0x0 {

    /* JADX INFO: renamed from: a */
    public final String f44098a;

    /* JADX INFO: renamed from: b */
    public final String f44099b;

    /* JADX INFO: renamed from: c */
    public final String f44100c;

    /* JADX INFO: renamed from: d */
    public final String f44101d;

    /* JADX INFO: renamed from: e */
    public final Set f44102e;

    public d0x0(String str, String str2, String str3, String str4, Set set) {
        this.f44098a = str;
        this.f44099b = str2;
        this.f44100c = str3;
        this.f44101d = str4;
        this.f44102e = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0x0)) {
            return false;
        }
        d0x0 d0x0Var = (d0x0) obj;
        return wj50.m88271j(this.f44098a, d0x0Var.f44098a) && wj50.m88271j(this.f44099b, d0x0Var.f44099b) && wj50.m88271j(this.f44100c, d0x0Var.f44100c) && wj50.m88271j(this.f44101d, d0x0Var.f44101d) && wj50.m88271j(this.f44102e, d0x0Var.f44102e);
    }

    public final int hashCode() {
        String str = this.f44098a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f44099b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f44100c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f44101d;
        return this.f44102e.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public /* synthetic */ d0x0(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, gbu.f78413a);
    }
}
