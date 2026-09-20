package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class myq0 {

    /* JADX INFO: renamed from: a */
    public final String f148502a;

    /* JADX INFO: renamed from: b */
    public final int f148503b;

    public myq0(String str, int i) {
        this.f148502a = str;
        this.f148503b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof myq0)) {
            return false;
        }
        myq0 myq0Var = (myq0) obj;
        return wj50.m88271j(this.f148502a, myq0Var.f148502a) && this.f148503b == myq0Var.f148503b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f148503b) + (this.f148502a.hashCode() * 31);
    }
}
