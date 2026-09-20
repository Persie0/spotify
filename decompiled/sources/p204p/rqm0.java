package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class rqm0 {

    /* JADX INFO: renamed from: a */
    public final String f201847a;

    /* JADX INFO: renamed from: b */
    public final boolean f201848b;

    /* JADX INFO: renamed from: c */
    public final boolean f201849c;

    /* JADX INFO: renamed from: d */
    public final boolean f201850d;

    public rqm0(String str, boolean z, boolean z2, boolean z3) {
        this.f201847a = str;
        this.f201848b = z;
        this.f201849c = z2;
        this.f201850d = z3;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m76257a() {
        return this.f201849c;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m76258b() {
        return this.f201848b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rqm0)) {
            return false;
        }
        rqm0 rqm0Var = (rqm0) obj;
        return wj50.m88271j(this.f201847a, rqm0Var.f201847a) && this.f201848b == rqm0Var.f201848b && this.f201849c == rqm0Var.f201849c && this.f201850d == rqm0Var.f201850d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f201850d) + s571.m77245d(s571.m77245d(this.f201847a.hashCode() * 31, 31, this.f201848b), 31, this.f201849c);
    }
}
