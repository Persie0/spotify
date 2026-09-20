package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vnr0 {

    /* JADX INFO: renamed from: a */
    public final String f243230a;

    /* JADX INFO: renamed from: b */
    public final String f243231b;

    /* JADX INFO: renamed from: c */
    public final String f243232c;

    /* JADX INFO: renamed from: d */
    public final boolean f243233d;

    public vnr0(String str, String str2, String str3, boolean z) {
        this.f243230a = str;
        this.f243231b = str2;
        this.f243232c = str3;
        this.f243233d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vnr0)) {
            return false;
        }
        vnr0 vnr0Var = (vnr0) obj;
        return wj50.m88271j(this.f243230a, vnr0Var.f243230a) && wj50.m88271j(this.f243231b, vnr0Var.f243231b) && wj50.m88271j(this.f243232c, vnr0Var.f243232c) && this.f243233d == vnr0Var.f243233d;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f243230a.hashCode() * 31, 31, this.f243231b);
        String str = this.f243232c;
        return Boolean.hashCode(this.f243233d) + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }
}
