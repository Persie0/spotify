package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class a5v {

    /* JADX INFO: renamed from: a */
    public final r0s f12599a;

    /* JADX INFO: renamed from: b */
    public final r0s f12600b;

    public a5v(r0s r0sVar, r0s r0sVar2) {
        this.f12599a = r0sVar;
        this.f12600b = r0sVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5v)) {
            return false;
        }
        a5v a5vVar = (a5v) obj;
        return wj50.m88271j(this.f12599a, a5vVar.f12599a) && wj50.m88271j(this.f12600b, a5vVar.f12600b);
    }

    public final int hashCode() {
        return this.f12600b.hashCode() + (this.f12599a.hashCode() * 31);
    }
}
