package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class vhf implements zhf {

    /* JADX INFO: renamed from: a */
    public final List f241509a;

    /* JADX INFO: renamed from: b */
    public final String f241510b;

    /* JADX INFO: renamed from: c */
    public final int f241511c;

    /* JADX INFO: renamed from: d */
    public final boolean f241512d;

    /* JADX INFO: renamed from: e */
    public final ov71 f241513e;

    public vhf(ae50 ae50Var, String str, int i, boolean z, ov71 ov71Var) {
        this.f241509a = ae50Var;
        this.f241510b = str;
        this.f241511c = i;
        this.f241512d = z;
        this.f241513e = ov71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhf)) {
            return false;
        }
        vhf vhfVar = (vhf) obj;
        return wj50.m88271j(this.f241509a, vhfVar.f241509a) && wj50.m88271j(this.f241510b, vhfVar.f241510b) && this.f241511c == vhfVar.f241511c && this.f241512d == vhfVar.f241512d && wj50.m88271j(this.f241513e, vhfVar.f241513e);
    }

    public final int hashCode() {
        return this.f241513e.hashCode() + s571.m77245d(mt60.m62800g(this.f241511c, s571.m77243b(this.f241509a.hashCode() * 31, 31, this.f241510b), 31), 31, this.f241512d);
    }
}
