package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class b3d1 implements c3d1 {

    /* JADX INFO: renamed from: a */
    public final String f23030a;

    /* JADX INFO: renamed from: b */
    public final String f23031b;

    /* JADX INFO: renamed from: c */
    public final String f23032c;

    public b3d1(String str, String str2, String str3) {
        this.f23030a = str;
        this.f23031b = str2;
        this.f23032c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3d1)) {
            return false;
        }
        b3d1 b3d1Var = (b3d1) obj;
        return wj50.m88271j(this.f23030a, b3d1Var.f23030a) && wj50.m88271j(this.f23031b, b3d1Var.f23031b) && wj50.m88271j(this.f23032c, b3d1Var.f23032c);
    }

    public final int hashCode() {
        return this.f23032c.hashCode() + s571.m77243b(this.f23030a.hashCode() * 31, 31, this.f23031b);
    }
}
