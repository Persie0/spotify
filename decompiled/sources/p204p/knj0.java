package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class knj0 {

    /* JADX INFO: renamed from: a */
    public final String f124433a;

    /* JADX INFO: renamed from: b */
    public final String f124434b;

    /* JADX INFO: renamed from: c */
    public final String f124435c;

    /* JADX INFO: renamed from: d */
    public final String f124436d;

    /* JADX INFO: renamed from: e */
    public final int f124437e;

    public knj0(int i, String str, String str2, String str3, String str4) {
        this.f124433a = str;
        this.f124434b = str2;
        this.f124435c = str3;
        this.f124436d = str4;
        this.f124437e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof knj0)) {
            return false;
        }
        knj0 knj0Var = (knj0) obj;
        return wj50.m88271j(this.f124433a, knj0Var.f124433a) && wj50.m88271j(this.f124434b, knj0Var.f124434b) && wj50.m88271j(this.f124435c, knj0Var.f124435c) && wj50.m88271j(this.f124436d, knj0Var.f124436d) && this.f124437e == knj0Var.f124437e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f124437e) + s571.m77243b(s571.m77243b(s571.m77243b(this.f124433a.hashCode() * 31, 31, this.f124434b), 31, this.f124435c), 31, this.f124436d);
    }
}
