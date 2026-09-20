package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ar31 {

    /* JADX INFO: renamed from: a */
    public final i490 f18929a;

    public ar31(i490 i490Var) {
        this.f18929a = i490Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ar31) && wj50.m88271j(this.f18929a, ((ar31) obj).f18929a);
    }

    public final int hashCode() {
        i490 i490Var = this.f18929a;
        if (i490Var == null) {
            return 0;
        }
        return i490Var.hashCode();
    }
}
