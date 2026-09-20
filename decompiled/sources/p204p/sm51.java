package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class sm51 {

    /* JADX INFO: renamed from: a */
    public final String f210568a;

    /* JADX INFO: renamed from: b */
    public final String f210569b;

    public sm51(String str, String str2) {
        this.f210568a = str;
        this.f210569b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sm51)) {
            return false;
        }
        sm51 sm51Var = (sm51) obj;
        return wj50.m88271j(this.f210568a, sm51Var.f210568a) && wj50.m88271j(this.f210569b, sm51Var.f210569b);
    }

    public final int hashCode() {
        return this.f210569b.hashCode() + (this.f210568a.hashCode() * 31);
    }
}
