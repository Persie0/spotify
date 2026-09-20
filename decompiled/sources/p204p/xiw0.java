package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xiw0 {

    /* JADX INFO: renamed from: a */
    public final wiw0 f261947a;

    /* JADX INFO: renamed from: b */
    public final String f261948b;

    /* JADX INFO: renamed from: c */
    public final String f261949c;

    public xiw0(wiw0 wiw0Var, String str, String str2) {
        this.f261947a = wiw0Var;
        this.f261948b = str;
        this.f261949c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xiw0)) {
            return false;
        }
        xiw0 xiw0Var = (xiw0) obj;
        return wj50.m88271j(this.f261947a, xiw0Var.f261947a) && wj50.m88271j(this.f261948b, xiw0Var.f261948b) && wj50.m88271j(this.f261949c, xiw0Var.f261949c);
    }

    public final int hashCode() {
        return this.f261949c.hashCode() + s571.m77243b(this.f261947a.hashCode() * 31, 31, this.f261948b);
    }
}
