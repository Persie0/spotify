package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class uu20 {

    /* JADX INFO: renamed from: a */
    public final int f234085a;

    /* JADX INFO: renamed from: b */
    public final String f234086b;

    /* JADX INFO: renamed from: c */
    public final String f234087c;

    public uu20(int i, String str, String str2) {
        this.f234085a = i;
        this.f234086b = str;
        this.f234087c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu20)) {
            return false;
        }
        uu20 uu20Var = (uu20) obj;
        return this.f234085a == uu20Var.f234085a && wj50.m88271j(this.f234086b, uu20Var.f234086b) && wj50.m88271j(this.f234087c, uu20Var.f234087c);
    }

    public final int hashCode() {
        return this.f234087c.hashCode() + s571.m77243b(Integer.hashCode(this.f234085a) * 31, 31, this.f234086b);
    }
}
