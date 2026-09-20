package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class kqa1 implements mqa1 {

    /* JADX INFO: renamed from: a */
    public final hp20 f125241a;

    /* JADX INFO: renamed from: b */
    public final bqa1 f125242b;

    public kqa1(hp20 hp20Var, bqa1 bqa1Var) {
        this.f125241a = hp20Var;
        this.f125242b = bqa1Var;
    }

    @Override // p204p.mqa1
    /* JADX INFO: renamed from: a */
    public final jp20 mo57087a() {
        return this.f125241a;
    }

    @Override // p204p.mqa1
    /* JADX INFO: renamed from: b */
    public final bqa1 mo57088b() {
        return this.f125242b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kqa1)) {
            return false;
        }
        kqa1 kqa1Var = (kqa1) obj;
        return wj50.m88271j(this.f125241a, kqa1Var.f125241a) && wj50.m88271j(this.f125242b, kqa1Var.f125242b);
    }

    public final int hashCode() {
        return this.f125242b.hashCode() + (this.f125241a.hashCode() * 31);
    }
}
