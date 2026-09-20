package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class njm0 implements dkm0 {

    /* JADX INFO: renamed from: a */
    public final String f154633a;

    /* JADX INFO: renamed from: b */
    public final String f154634b;

    /* JADX INFO: renamed from: c */
    public final String f154635c;

    /* JADX INFO: renamed from: d */
    public final gkm0 f154636d;

    public njm0(String str, String str2, String str3, gkm0 gkm0Var) {
        this.f154633a = str;
        this.f154634b = str2;
        this.f154635c = str3;
        this.f154636d = gkm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof njm0)) {
            return false;
        }
        njm0 njm0Var = (njm0) obj;
        return wj50.m88271j(this.f154633a, njm0Var.f154633a) && wj50.m88271j(this.f154634b, njm0Var.f154634b) && wj50.m88271j(this.f154635c, njm0Var.f154635c) && wj50.m88271j(this.f154636d, njm0Var.f154636d);
    }

    public final int hashCode() {
        return this.f154636d.hashCode() + s571.m77243b(s571.m77243b(this.f154633a.hashCode() * 31, 31, this.f154634b), 31, this.f154635c);
    }
}
