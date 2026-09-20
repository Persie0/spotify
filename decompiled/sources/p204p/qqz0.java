package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qqz0 {

    /* JADX INFO: renamed from: a */
    public final String f191679a;

    /* JADX INFO: renamed from: b */
    public final String f191680b;

    /* JADX INFO: renamed from: c */
    public final arz0 f191681c;

    /* JADX INFO: renamed from: d */
    public final String f191682d;

    public qqz0(String str, String str2, arz0 arz0Var, String str3) {
        this.f191679a = str;
        this.f191680b = str2;
        this.f191681c = arz0Var;
        this.f191682d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqz0)) {
            return false;
        }
        qqz0 qqz0Var = (qqz0) obj;
        return wj50.m88271j(this.f191679a, qqz0Var.f191679a) && wj50.m88271j(this.f191680b, qqz0Var.f191680b) && wj50.m88271j(this.f191681c, qqz0Var.f191681c) && wj50.m88271j(this.f191682d, qqz0Var.f191682d);
    }

    public final int hashCode() {
        int iHashCode = (this.f191681c.hashCode() + s571.m77243b(this.f191679a.hashCode() * 31, 31, this.f191680b)) * 31;
        String str = this.f191682d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
