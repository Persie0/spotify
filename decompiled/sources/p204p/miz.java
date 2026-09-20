package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class miz {

    /* JADX INFO: renamed from: a */
    public final String f144122a;

    /* JADX INFO: renamed from: b */
    public final c10 f144123b;

    public miz(String str, c10 c10Var) {
        this.f144122a = str;
        this.f144123b = c10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof miz)) {
            return false;
        }
        miz mizVar = (miz) obj;
        return wj50.m88271j(this.f144122a, mizVar.f144122a) && wj50.m88271j(this.f144123b, mizVar.f144123b);
    }

    public final int hashCode() {
        return this.f144123b.hashCode() + (this.f144122a.hashCode() * 31);
    }
}
