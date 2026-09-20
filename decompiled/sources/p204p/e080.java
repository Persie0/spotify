package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class e080 {

    /* JADX INFO: renamed from: a */
    public final fh0 f54898a;

    /* JADX INFO: renamed from: b */
    public final int f54899b;

    /* JADX INFO: renamed from: c */
    public final boolean f54900c;

    /* JADX INFO: renamed from: d */
    public final String f54901d;

    public e080(fh0 fh0Var, int i, boolean z, String str) {
        this.f54898a = fh0Var;
        this.f54899b = i;
        this.f54900c = z;
        this.f54901d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e080)) {
            return false;
        }
        e080 e080Var = (e080) obj;
        return wj50.m88271j(this.f54898a, e080Var.f54898a) && this.f54899b == e080Var.f54899b && this.f54900c == e080Var.f54900c && wj50.m88271j(this.f54901d, e080Var.f54901d);
    }

    public final int hashCode() {
        return this.f54901d.hashCode() + s571.m77245d(mt60.m62800g(this.f54899b, this.f54898a.hashCode() * 31, 31), 31, this.f54900c);
    }
}
