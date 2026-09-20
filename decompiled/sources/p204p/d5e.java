package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class d5e {

    /* JADX INFO: renamed from: a */
    public final int f45402a;

    /* JADX INFO: renamed from: b */
    public final s4e f45403b;

    public d5e(int i, s4e s4eVar) {
        this.f45402a = i;
        this.f45403b = s4eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5e)) {
            return false;
        }
        d5e d5eVar = (d5e) obj;
        return this.f45402a == d5eVar.f45402a && wj50.m88271j(this.f45403b, d5eVar.f45403b);
    }

    public final int hashCode() {
        return this.f45403b.hashCode() + (Integer.hashCode(this.f45402a) * 31);
    }
}
