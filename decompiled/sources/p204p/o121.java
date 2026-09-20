package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class o121 extends s121 {

    /* JADX INFO: renamed from: a */
    public final String f160575a;

    /* JADX INFO: renamed from: b */
    public final p121 f160576b;

    public o121(String str, p121 p121Var) {
        this.f160575a = str;
        this.f160576b = p121Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o121)) {
            return false;
        }
        o121 o121Var = (o121) obj;
        return wj50.m88271j(this.f160575a, o121Var.f160575a) && this.f160576b == o121Var.f160576b;
    }

    public final int hashCode() {
        int iHashCode = this.f160575a.hashCode() * 31;
        p121 p121Var = this.f160576b;
        return iHashCode + (p121Var == null ? 0 : p121Var.hashCode());
    }
}
