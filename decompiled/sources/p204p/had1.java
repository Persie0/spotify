package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class had1 {

    /* JADX INFO: renamed from: a */
    public final String f89199a;

    /* JADX INFO: renamed from: b */
    public final String f89200b;

    public had1(String str, String str2) {
        this.f89199a = str;
        this.f89200b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof had1)) {
            return false;
        }
        had1 had1Var = (had1) obj;
        return wj50.m88271j(this.f89199a, had1Var.f89199a) && wj50.m88271j(this.f89200b, had1Var.f89200b);
    }

    public final int hashCode() {
        return this.f89200b.hashCode() + (this.f89199a.hashCode() * 31);
    }
}
