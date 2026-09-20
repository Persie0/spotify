package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rae0 {

    /* JADX INFO: renamed from: a */
    public final String f197292a;

    /* JADX INFO: renamed from: b */
    public final String f197293b;

    /* JADX INFO: renamed from: c */
    public final String f197294c;

    public rae0(String str, String str2, String str3) {
        this.f197292a = str;
        this.f197293b = str2;
        this.f197294c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rae0)) {
            return false;
        }
        rae0 rae0Var = (rae0) obj;
        return wj50.m88271j(this.f197292a, rae0Var.f197292a) && wj50.m88271j(this.f197293b, rae0Var.f197293b) && wj50.m88271j(this.f197294c, rae0Var.f197294c);
    }

    public final int hashCode() {
        return this.f197294c.hashCode() + s571.m77243b(this.f197292a.hashCode() * 31, 31, this.f197293b);
    }
}
