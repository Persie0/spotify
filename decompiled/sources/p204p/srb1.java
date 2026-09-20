package p204p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class srb1 {

    /* JADX INFO: renamed from: a */
    public final boolean f213294a;

    /* JADX INFO: renamed from: b */
    public final List f213295b;

    /* JADX INFO: renamed from: c */
    public final noa1 f213296c;

    /* JADX INFO: renamed from: d */
    public final Map f213297d;

    public srb1(boolean z, List list, noa1 noa1Var, Map map) {
        this.f213294a = z;
        this.f213295b = list;
        this.f213296c = noa1Var;
        this.f213297d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof srb1)) {
            return false;
        }
        srb1 srb1Var = (srb1) obj;
        return this.f213294a == srb1Var.f213294a && wj50.m88271j(this.f213295b, srb1Var.f213295b) && wj50.m88271j(this.f213296c, srb1Var.f213296c) && wj50.m88271j(this.f213297d, srb1Var.f213297d);
    }

    public final int hashCode() {
        return this.f213297d.hashCode() + ((this.f213296c.hashCode() + s571.m77244c(Boolean.hashCode(this.f213294a) * 31, 31, this.f213295b)) * 31);
    }
}
