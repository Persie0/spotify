package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class br51 {

    /* JADX INFO: renamed from: a */
    public final String f29971a;

    /* JADX INFO: renamed from: b */
    public final String f29972b;

    /* JADX INFO: renamed from: c */
    public final boolean f29973c;

    public br51(String str, String str2, boolean z) {
        this.f29971a = str;
        this.f29972b = str2;
        this.f29973c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof br51)) {
            return false;
        }
        br51 br51Var = (br51) obj;
        return wj50.m88271j(this.f29971a, br51Var.f29971a) && wj50.m88271j(this.f29972b, br51Var.f29972b) && this.f29973c == br51Var.f29973c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f29973c) + s571.m77243b(this.f29971a.hashCode() * 31, 31, this.f29972b);
    }
}
