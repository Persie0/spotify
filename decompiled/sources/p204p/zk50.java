package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zk50 implements bl50 {

    /* JADX INFO: renamed from: a */
    public final String f283664a;

    /* JADX INFO: renamed from: b */
    public final String f283665b;

    public zk50(String str, String str2) {
        this.f283664a = str;
        this.f283665b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zk50)) {
            return false;
        }
        zk50 zk50Var = (zk50) obj;
        return wj50.m88271j(this.f283664a, zk50Var.f283664a) && wj50.m88271j(this.f283665b, zk50Var.f283665b);
    }

    public final int hashCode() {
        return this.f283665b.hashCode() + (this.f283664a.hashCode() * 31);
    }
}
