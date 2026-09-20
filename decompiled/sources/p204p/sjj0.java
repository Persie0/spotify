package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sjj0 {

    /* JADX INFO: renamed from: a */
    public final p6y f209865a;

    /* JADX INFO: renamed from: b */
    public final st91 f209866b;

    public sjj0(p6y p6yVar, st91 st91Var) {
        this.f209865a = p6yVar;
        this.f209866b = st91Var;
    }

    /* JADX INFO: renamed from: a */
    public final p6y m78345a() {
        return this.f209865a;
    }

    /* JADX INFO: renamed from: b */
    public final st91 m78346b() {
        return this.f209866b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sjj0)) {
            return false;
        }
        sjj0 sjj0Var = (sjj0) obj;
        return wj50.m88271j(this.f209865a, sjj0Var.f209865a) && wj50.m88271j(this.f209866b, sjj0Var.f209866b);
    }

    public final int hashCode() {
        return this.f209866b.f213866a.hashCode() + (this.f209865a.hashCode() * 31);
    }
}
