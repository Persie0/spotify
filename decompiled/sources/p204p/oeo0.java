package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class oeo0 {

    /* JADX INFO: renamed from: a */
    public final gh00 f164501a;

    /* JADX INFO: renamed from: b */
    public final zhe f164502b;

    /* JADX INFO: renamed from: c */
    public final List f164503c;

    public oeo0(gh00 gh00Var, zhe zheVar, List list) {
        this.f164501a = gh00Var;
        this.f164502b = zheVar;
        this.f164503c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oeo0)) {
            return false;
        }
        oeo0 oeo0Var = (oeo0) obj;
        return wj50.m88271j(this.f164501a, oeo0Var.f164501a) && this.f164502b.equals(oeo0Var.f164502b) && this.f164503c.equals(oeo0Var.f164503c);
    }

    public final int hashCode() {
        return this.f164503c.hashCode() + mt60.m62800g(this.f164502b.f282900a, this.f164501a.hashCode() * 31, 31);
    }
}
