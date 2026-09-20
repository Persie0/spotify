package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kq6 {

    /* JADX INFO: renamed from: a */
    public final String f125223a;

    /* JADX INFO: renamed from: b */
    public final String f125224b;

    /* JADX INFO: renamed from: c */
    public final String f125225c;

    public kq6(String str, String str2, String str3) {
        this.f125223a = str;
        this.f125224b = str2;
        this.f125225c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kq6)) {
            return false;
        }
        kq6 kq6Var = (kq6) obj;
        return wj50.m88271j(this.f125223a, kq6Var.f125223a) && wj50.m88271j(this.f125224b, kq6Var.f125224b) && wj50.m88271j(this.f125225c, kq6Var.f125225c);
    }

    public final int hashCode() {
        return this.f125225c.hashCode() + s571.m77243b(this.f125223a.hashCode() * 31, 31, this.f125224b);
    }
}
