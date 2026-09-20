package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class c6v {

    /* JADX INFO: renamed from: a */
    public final r0s f34633a;

    /* JADX INFO: renamed from: b */
    public final boolean f34634b;

    public c6v(r0s r0sVar, boolean z) {
        this.f34633a = r0sVar;
        this.f34634b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6v)) {
            return false;
        }
        c6v c6vVar = (c6v) obj;
        return wj50.m88271j(this.f34633a, c6vVar.f34633a) && this.f34634b == c6vVar.f34634b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f34634b) + (this.f34633a.hashCode() * 31);
    }
}
