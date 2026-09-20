package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class j9i0 {

    /* JADX INFO: renamed from: a */
    public final String f110179a;

    /* JADX INFO: renamed from: b */
    public final String f110180b;

    /* JADX INFO: renamed from: c */
    public final z00 f110181c;

    /* JADX INFO: renamed from: d */
    public final boolean f110182d;

    /* JADX INFO: renamed from: e */
    public final Long f110183e;

    /* JADX INFO: renamed from: f */
    public final List f110184f;

    public j9i0(String str, String str2, z00 z00Var, boolean z, Long l, List list) {
        this.f110179a = str;
        this.f110180b = str2;
        this.f110181c = z00Var;
        this.f110182d = z;
        this.f110183e = l;
        this.f110184f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9i0)) {
            return false;
        }
        j9i0 j9i0Var = (j9i0) obj;
        return wj50.m88271j(this.f110179a, j9i0Var.f110179a) && wj50.m88271j(this.f110180b, j9i0Var.f110180b) && wj50.m88271j(this.f110181c, j9i0Var.f110181c) && this.f110182d == j9i0Var.f110182d && wj50.m88271j(this.f110183e, j9i0Var.f110183e) && wj50.m88271j(this.f110184f, j9i0Var.f110184f);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d((this.f110181c.hashCode() + s571.m77243b(this.f110179a.hashCode() * 31, 31, this.f110180b)) * 31, 31, this.f110182d);
        Long l = this.f110183e;
        int iHashCode = (iM77245d + (l == null ? 0 : l.hashCode())) * 31;
        List list = this.f110184f;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }
}
