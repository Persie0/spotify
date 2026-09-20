package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class sti0 extends vti0 {

    /* JADX INFO: renamed from: a */
    public final int f213919a;

    public sti0(int i) {
        this.f213919a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sti0) && this.f213919a == ((sti0) obj).f213919a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f213919a);
    }
}
