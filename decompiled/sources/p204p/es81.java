package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class es81 {

    /* JADX INFO: renamed from: a */
    public final String f62308a;

    /* JADX INFO: renamed from: b */
    public final String f62309b;

    /* JADX INFO: renamed from: c */
    public final int f62310c;

    public es81(String str, String str2, int i) {
        this.f62308a = str;
        this.f62309b = str2;
        this.f62310c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof es81)) {
            return false;
        }
        es81 es81Var = (es81) obj;
        return this.f62308a.equals(es81Var.f62308a) && wj50.m88271j(this.f62309b, es81Var.f62309b) && this.f62310c == es81Var.f62310c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f62310c) + s571.m77243b(this.f62308a.hashCode() * 31, 31, this.f62309b);
    }
}
