package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zk70 implements al70 {

    /* JADX INFO: renamed from: a */
    public final boolean f283670a;

    /* JADX INFO: renamed from: b */
    public final String f283671b;

    public /* synthetic */ zk70() {
        this(false, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zk70)) {
            return false;
        }
        zk70 zk70Var = (zk70) obj;
        return this.f283670a == zk70Var.f283670a && wj50.m88271j(this.f283671b, zk70Var.f283671b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f283670a) * 31;
        String str = this.f283671b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public zk70(boolean z, String str) {
        this.f283670a = z;
        this.f283671b = str;
    }
}
