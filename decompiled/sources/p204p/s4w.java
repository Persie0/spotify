package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class s4w {

    /* JADX INFO: renamed from: a */
    public final boolean f205649a;

    /* JADX INFO: renamed from: b */
    public final int f205650b;

    public s4w(boolean z, int i) {
        this.f205649a = z;
        this.f205650b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4w)) {
            return false;
        }
        s4w s4wVar = (s4w) obj;
        return this.f205649a == s4wVar.f205649a && this.f205650b == s4wVar.f205650b;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f205649a) * 31;
        int i = this.f205650b;
        return iHashCode + (i == 0 ? 0 : edb.m38547C(i));
    }
}
