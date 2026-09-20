package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class iqj0 implements kqj0 {

    /* JADX INFO: renamed from: a */
    public final int f104797a;

    public iqj0(int i) {
        this.f104797a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iqj0) && this.f104797a == ((iqj0) obj).f104797a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f104797a);
    }
}
