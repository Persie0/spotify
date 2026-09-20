package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ge7 {

    /* JADX INFO: renamed from: a */
    public final String f79037a;

    /* JADX INFO: renamed from: b */
    public final String f79038b;

    /* JADX INFO: renamed from: c */
    public final String f79039c;

    /* JADX INFO: renamed from: d */
    public final int f79040d;

    public ge7(String str, String str2, int i, String str3) {
        this.f79037a = str;
        this.f79038b = str2;
        this.f79039c = str3;
        this.f79040d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge7)) {
            return false;
        }
        ge7 ge7Var = (ge7) obj;
        return wj50.m88271j(this.f79037a, ge7Var.f79037a) && wj50.m88271j(this.f79038b, ge7Var.f79038b) && wj50.m88271j(this.f79039c, ge7Var.f79039c) && this.f79040d == ge7Var.f79040d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f79040d) + s571.m77243b(s571.m77243b(this.f79037a.hashCode() * 31, 31, this.f79038b), 31, this.f79039c);
    }
}
