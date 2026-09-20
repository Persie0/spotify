package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zq31 {

    /* JADX INFO: renamed from: a */
    public final i490 f285302a;

    public zq31(i490 i490Var) {
        this.f285302a = i490Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zq31) && wj50.m88271j(this.f285302a, ((zq31) obj).f285302a);
    }

    public final int hashCode() {
        i490 i490Var = this.f285302a;
        if (i490Var == null) {
            return 0;
        }
        return i490Var.hashCode();
    }
}
