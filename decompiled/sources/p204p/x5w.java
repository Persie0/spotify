package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class x5w {

    /* JADX INFO: renamed from: a */
    public final aoo0 f258530a;

    /* JADX INFO: renamed from: b */
    public final f62 f258531b;

    public x5w(aoo0 aoo0Var, f62 f62Var) {
        this.f258530a = aoo0Var;
        this.f258531b = f62Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5w)) {
            return false;
        }
        x5w x5wVar = (x5w) obj;
        return wj50.m88271j(this.f258530a, x5wVar.f258530a) && wj50.m88271j(this.f258531b, x5wVar.f258531b);
    }

    public final int hashCode() {
        return this.f258531b.hashCode() + (this.f258530a.hashCode() * 31);
    }
}
