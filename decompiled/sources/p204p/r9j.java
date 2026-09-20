package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class r9j implements v9j {

    /* JADX INFO: renamed from: a */
    public final int f197066a;

    /* JADX INFO: renamed from: b */
    public final int f197067b;

    /* JADX INFO: renamed from: c */
    public final String f197068c;

    public r9j(int i, int i2, String str) {
        this.f197066a = i;
        this.f197067b = i2;
        this.f197068c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9j)) {
            return false;
        }
        r9j r9jVar = (r9j) obj;
        return this.f197066a == r9jVar.f197066a && this.f197067b == r9jVar.f197067b && wj50.m88271j(this.f197068c, r9jVar.f197068c);
    }

    public final int hashCode() {
        return s571.m77243b(mt60.m62800g(this.f197067b, Integer.hashCode(this.f197066a) * 31, 31), 31, this.f197068c);
    }
}
