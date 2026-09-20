package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class o37 implements r37 {

    /* JADX INFO: renamed from: a */
    public final String f161296a;

    /* JADX INFO: renamed from: b */
    public final String f161297b;

    public o37(String str, String str2) {
        this.f161296a = str;
        this.f161297b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o37)) {
            return false;
        }
        o37 o37Var = (o37) obj;
        return wj50.m88271j(this.f161296a, o37Var.f161296a) && wj50.m88271j(this.f161297b, o37Var.f161297b);
    }

    public final int hashCode() {
        return this.f161297b.hashCode() + (this.f161296a.hashCode() * 31);
    }
}
