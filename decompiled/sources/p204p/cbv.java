package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class cbv {

    /* JADX INFO: renamed from: a */
    public final String f36234a;

    /* JADX INFO: renamed from: b */
    public final String f36235b;

    /* JADX INFO: renamed from: c */
    public final String f36236c;

    public cbv(String str, String str2, String str3) {
        this.f36234a = str;
        this.f36235b = str2;
        this.f36236c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbv)) {
            return false;
        }
        cbv cbvVar = (cbv) obj;
        return wj50.m88271j(this.f36234a, cbvVar.f36234a) && wj50.m88271j(this.f36235b, cbvVar.f36235b) && wj50.m88271j(this.f36236c, cbvVar.f36236c);
    }

    public final int hashCode() {
        return this.f36236c.hashCode() + s571.m77243b(this.f36234a.hashCode() * 31, 31, this.f36235b);
    }
}
