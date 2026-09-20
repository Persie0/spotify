package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class iry {

    /* JADX INFO: renamed from: a */
    public final int f105067a;

    /* JADX INFO: renamed from: b */
    public final r300 f105068b;

    /* JADX INFO: renamed from: c */
    public final lfz0 f105069c;

    public iry(int i, r300 r300Var, lfz0 lfz0Var) {
        this.f105067a = i;
        this.f105068b = r300Var;
        this.f105069c = lfz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iry)) {
            return false;
        }
        iry iryVar = (iry) obj;
        return this.f105067a == iryVar.f105067a && wj50.m88271j(this.f105068b, iryVar.f105068b) && wj50.m88271j(this.f105069c, iryVar.f105069c);
    }

    public final int hashCode() {
        return this.f105069c.hashCode() + ((this.f105068b.hashCode() + (Integer.hashCode(this.f105067a) * 31)) * 31);
    }
}
