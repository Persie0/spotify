package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ky41 implements un20 {

    /* JADX INFO: renamed from: a */
    public final String f127651a;

    /* JADX INFO: renamed from: b */
    public final String f127652b;

    /* JADX INFO: renamed from: c */
    public final String f127653c;

    /* JADX INFO: renamed from: d */
    public final String f127654d;

    public ky41(String str, String str2, String str3, String str4) {
        this.f127651a = str;
        this.f127652b = str2;
        this.f127653c = str3;
        this.f127654d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky41)) {
            return false;
        }
        ky41 ky41Var = (ky41) obj;
        return wj50.m88271j(this.f127651a, ky41Var.f127651a) && wj50.m88271j(this.f127652b, ky41Var.f127652b) && wj50.m88271j(this.f127653c, ky41Var.f127653c) && wj50.m88271j(this.f127654d, ky41Var.f127654d);
    }

    public final int hashCode() {
        return this.f127654d.hashCode() + s571.m77243b(s571.m77243b(this.f127651a.hashCode() * 31, 31, this.f127652b), 31, this.f127653c);
    }
}
