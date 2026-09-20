package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class up2 implements vp2 {

    /* JADX INFO: renamed from: a */
    public final String f232556a;

    /* JADX INFO: renamed from: b */
    public final String f232557b;

    /* JADX INFO: renamed from: c */
    public final String f232558c;

    /* JADX INFO: renamed from: d */
    public final String f232559d;

    /* JADX INFO: renamed from: e */
    public final List f232560e;

    public up2(String str, String str2, String str3, String str4, List list) {
        this.f232556a = str;
        this.f232557b = str2;
        this.f232558c = str3;
        this.f232559d = str4;
        this.f232560e = list;
    }

    /* JADX INFO: renamed from: a */
    public final String m83642a() {
        return this.f232556a;
    }

    /* JADX INFO: renamed from: b */
    public final List m83643b() {
        return this.f232560e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up2)) {
            return false;
        }
        up2 up2Var = (up2) obj;
        return wj50.m88271j(this.f232556a, up2Var.f232556a) && wj50.m88271j(this.f232557b, up2Var.f232557b) && wj50.m88271j(this.f232558c, up2Var.f232558c) && wj50.m88271j(this.f232559d, up2Var.f232559d) && wj50.m88271j(this.f232560e, up2Var.f232560e);
    }

    public final int hashCode() {
        int iHashCode = this.f232556a.hashCode() * 31;
        String str = this.f232557b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f232558c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f232559d;
        return this.f232560e.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
