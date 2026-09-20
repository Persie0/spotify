package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class i5u {

    /* JADX INFO: renamed from: a */
    public final ef81 f99023a;

    /* JADX INFO: renamed from: b */
    public boolean f99024b = false;

    /* JADX INFO: renamed from: c */
    public final qs0 f99025c;

    public i5u(ef81 ef81Var, qs0 qs0Var) {
        this.f99023a = ef81Var;
        this.f99025c = qs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5u)) {
            return false;
        }
        i5u i5uVar = (i5u) obj;
        return wj50.m88271j(this.f99023a, i5uVar.f99023a) && this.f99024b == i5uVar.f99024b && this.f99025c == i5uVar.f99025c;
    }

    public final int hashCode() {
        return this.f99025c.hashCode() + s571.m77245d(this.f99023a.hashCode() * 31, 31, this.f99024b);
    }
}
