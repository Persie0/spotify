package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fsf0 {

    /* JADX INFO: renamed from: a */
    public final String f72843a;

    /* JADX INFO: renamed from: b */
    public final b791 f72844b;

    /* JADX INFO: renamed from: c */
    public final boolean f72845c;

    /* JADX INFO: renamed from: d */
    public final Float f72846d;

    /* JADX INFO: renamed from: e */
    public final boolean f72847e;

    public /* synthetic */ fsf0(String str, b791 b791Var, Float f, int i) {
        this(str, b791Var, true, (i & 8) != 0 ? null : f, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsf0)) {
            return false;
        }
        fsf0 fsf0Var = (fsf0) obj;
        return wj50.m88271j(this.f72843a, fsf0Var.f72843a) && wj50.m88271j(this.f72844b, fsf0Var.f72844b) && this.f72845c == fsf0Var.f72845c && wj50.m88271j(this.f72846d, fsf0Var.f72846d) && this.f72847e == fsf0Var.f72847e;
    }

    public final int hashCode() {
        int iHashCode = this.f72843a.hashCode() * 31;
        b791 b791Var = this.f72844b;
        int iM77245d = s571.m77245d((iHashCode + (b791Var == null ? 0 : b791Var.hashCode())) * 31, 31, this.f72845c);
        Float f = this.f72846d;
        return Boolean.hashCode(this.f72847e) + ((iM77245d + (f != null ? f.hashCode() : 0)) * 31);
    }

    public fsf0(String str, b791 b791Var, boolean z, Float f, boolean z2) {
        this.f72843a = str;
        this.f72844b = b791Var;
        this.f72845c = z;
        this.f72846d = f;
        this.f72847e = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fsf0(String str) {
        this(str, null, 0 == true ? 1 : 0, 24);
    }

    public fsf0(String str, Float f) {
        this(str, null, f, 16);
    }
}
