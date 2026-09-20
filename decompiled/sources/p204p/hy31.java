package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hy31 extends kp20 {

    /* JADX INFO: renamed from: a */
    public final String f96452a;

    /* JADX INFO: renamed from: b */
    public final String f96453b;

    /* JADX INFO: renamed from: c */
    public final String f96454c;

    public hy31(String str, String str2, String str3) {
        this.f96452a = str;
        this.f96453b = str2;
        this.f96454c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hy31)) {
            return false;
        }
        hy31 hy31Var = (hy31) obj;
        return wj50.m88271j(this.f96452a, hy31Var.f96452a) && wj50.m88271j(this.f96453b, hy31Var.f96453b) && wj50.m88271j(this.f96454c, hy31Var.f96454c);
    }

    public final int hashCode() {
        return this.f96454c.hashCode() + s571.m77243b(this.f96452a.hashCode() * 31, 31, this.f96453b);
    }
}
