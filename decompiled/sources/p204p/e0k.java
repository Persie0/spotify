package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class e0k {

    /* JADX INFO: renamed from: a */
    public final r5k f54984a;

    /* JADX INFO: renamed from: b */
    public final fr40 f54985b;

    public e0k(r5k r5kVar, fr40 fr40Var) {
        this.f54984a = r5kVar;
        this.f54985b = fr40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0k)) {
            return false;
        }
        e0k e0kVar = (e0k) obj;
        return this.f54984a == e0kVar.f54984a && wj50.m88271j(this.f54985b, e0kVar.f54985b);
    }

    public final int hashCode() {
        return this.f54985b.hashCode() + (this.f54984a.hashCode() * 31);
    }
}
