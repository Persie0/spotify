package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class oin0 {

    /* JADX INFO: renamed from: a */
    public final int f165841a;

    /* JADX INFO: renamed from: b */
    public final String f165842b;

    /* JADX INFO: renamed from: c */
    public final String f165843c;

    /* JADX INFO: renamed from: d */
    public final String f165844d;

    /* JADX INFO: renamed from: e */
    public final m730 f165845e;

    public oin0(int i, String str, String str2, String str3, m730 m730Var) {
        this.f165841a = i;
        this.f165842b = str;
        this.f165843c = str2;
        this.f165844d = str3;
        this.f165845e = m730Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oin0)) {
            return false;
        }
        oin0 oin0Var = (oin0) obj;
        return this.f165841a == oin0Var.f165841a && wj50.m88271j(this.f165842b, oin0Var.f165842b) && wj50.m88271j(this.f165843c, oin0Var.f165843c) && wj50.m88271j(this.f165844d, oin0Var.f165844d) && wj50.m88271j(this.f165845e, oin0Var.f165845e);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f165841a) * 31;
        String str = this.f165842b;
        return this.f165845e.hashCode() + s571.m77243b(s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f165843c), 31, this.f165844d);
    }
}
