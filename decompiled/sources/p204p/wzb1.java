package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class wzb1 {

    /* JADX INFO: renamed from: a */
    public final boolean f256561a;

    /* JADX INFO: renamed from: b */
    public final boolean f256562b;

    /* JADX INFO: renamed from: c */
    public final String f256563c;

    /* JADX INFO: renamed from: d */
    public final boolean f256564d;

    public wzb1(String str, boolean z, boolean z2, boolean z3) {
        this.f256561a = z;
        this.f256562b = z2;
        this.f256563c = str;
        this.f256564d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wzb1)) {
            return false;
        }
        wzb1 wzb1Var = (wzb1) obj;
        return this.f256561a == wzb1Var.f256561a && this.f256562b == wzb1Var.f256562b && wj50.m88271j(this.f256563c, wzb1Var.f256563c) && this.f256564d == wzb1Var.f256564d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f256564d) + s571.m77243b(s571.m77245d(Boolean.hashCode(this.f256561a) * 31, 31, this.f256562b), 31, this.f256563c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ wzb1(boolean z, int i) {
        String str;
        z = (i & 2) != 0 ? false : z;
        if ((i & 4) != 0) {
            str = "";
        } else {
            str = "watch-feed-entity-explorer-button";
        }
        this(str, false, z, false);
    }
}
