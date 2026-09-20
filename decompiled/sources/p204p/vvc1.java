package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class vvc1 {

    /* JADX INFO: renamed from: a */
    public final String f245209a;

    /* JADX INFO: renamed from: b */
    public final String f245210b;

    /* JADX INFO: renamed from: c */
    public final String f245211c;

    /* JADX INFO: renamed from: d */
    public final String f245212d;

    /* JADX INFO: renamed from: e */
    public final boolean f245213e;

    public vvc1(String str, String str2, String str3, String str4, boolean z) {
        this.f245209a = str;
        this.f245210b = str2;
        this.f245211c = str3;
        this.f245212d = str4;
        this.f245213e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvc1)) {
            return false;
        }
        vvc1 vvc1Var = (vvc1) obj;
        return wj50.m88271j(this.f245209a, vvc1Var.f245209a) && wj50.m88271j(this.f245210b, vvc1Var.f245210b) && wj50.m88271j(this.f245211c, vvc1Var.f245211c) && wj50.m88271j(this.f245212d, vvc1Var.f245212d) && this.f245213e == vvc1Var.f245213e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f245213e) + s571.m77243b(s571.m77243b(s571.m77243b(this.f245209a.hashCode() * 31, 31, this.f245210b), 31, this.f245211c), 31, this.f245212d);
    }
}
