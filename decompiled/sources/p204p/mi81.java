package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mi81 implements oi81 {

    /* JADX INFO: renamed from: a */
    public final String f143961a;

    /* JADX INFO: renamed from: b */
    public final String f143962b;

    /* JADX INFO: renamed from: c */
    public final String f143963c;

    /* JADX INFO: renamed from: d */
    public final String f143964d;

    public mi81(String str, String str2, String str3, String str4) {
        this.f143961a = str;
        this.f143962b = str2;
        this.f143963c = str3;
        this.f143964d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi81)) {
            return false;
        }
        mi81 mi81Var = (mi81) obj;
        return wj50.m88271j(this.f143961a, mi81Var.f143961a) && wj50.m88271j(this.f143962b, mi81Var.f143962b) && wj50.m88271j(this.f143963c, mi81Var.f143963c) && wj50.m88271j(this.f143964d, mi81Var.f143964d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f143961a.hashCode() * 31, 31, this.f143962b);
        String str = this.f143963c;
        return this.f143964d.hashCode() + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }
}
