package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class zd20 {

    /* JADX INFO: renamed from: a */
    public final String f281613a;

    /* JADX INFO: renamed from: b */
    public final int f281614b;

    public zd20(String str, int i) {
        this.f281613a = str;
        this.f281614b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd20)) {
            return false;
        }
        zd20 zd20Var = (zd20) obj;
        return wj50.m88271j(this.f281613a, zd20Var.f281613a) && this.f281614b == zd20Var.f281614b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f281614b) + (this.f281613a.hashCode() * 31);
    }
}
