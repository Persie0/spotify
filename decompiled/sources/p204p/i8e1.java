package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class i8e1 extends u8e1 {

    /* JADX INFO: renamed from: a */
    public final int f99770a;

    public i8e1(int i) {
        this.f99770a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i8e1) && this.f99770a == ((i8e1) obj).f99770a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f99770a);
    }
}
