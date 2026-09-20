package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class z6d0 {

    /* JADX INFO: renamed from: a */
    public final int f279831a;

    /* JADX INFO: renamed from: b */
    public final String f279832b;

    /* JADX INFO: renamed from: c */
    public final String f279833c;

    /* JADX INFO: renamed from: d */
    public final String f279834d;

    /* JADX INFO: renamed from: e */
    public final int f279835e;

    /* JADX INFO: renamed from: f */
    public final String f279836f;

    public z6d0(int i, int i2, String str, String str2, String str3, String str4) {
        this.f279831a = i;
        this.f279832b = str;
        this.f279833c = str2;
        this.f279834d = str3;
        this.f279835e = i2;
        this.f279836f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6d0)) {
            return false;
        }
        z6d0 z6d0Var = (z6d0) obj;
        return this.f279831a == z6d0Var.f279831a && wj50.m88271j(this.f279832b, z6d0Var.f279832b) && wj50.m88271j(this.f279833c, z6d0Var.f279833c) && wj50.m88271j(this.f279834d, z6d0Var.f279834d) && this.f279835e == z6d0Var.f279835e && wj50.m88271j(this.f279836f, z6d0Var.f279836f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(Integer.hashCode(this.f279831a) * 31, 31, this.f279832b), 31, this.f279833c);
        String str = this.f279834d;
        return this.f279836f.hashCode() + f710.m40938f(this.f279835e, (iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31);
    }
}
