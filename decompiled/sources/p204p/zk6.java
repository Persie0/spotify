package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zk6 {

    /* JADX INFO: renamed from: a */
    public final String f283666a;

    /* JADX INFO: renamed from: b */
    public final boolean f283667b;

    public zk6(String str, boolean z) {
        this.f283666a = str;
        this.f283667b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zk6)) {
            return false;
        }
        zk6 zk6Var = (zk6) obj;
        return wj50.m88271j(this.f283666a, zk6Var.f283666a) && this.f283667b == zk6Var.f283667b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f283667b) + (this.f283666a.hashCode() * 31);
    }
}
