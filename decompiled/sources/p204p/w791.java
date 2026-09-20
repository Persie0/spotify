package p204p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class w791 {

    /* JADX INFO: renamed from: a */
    public final l9y f248609a;

    /* JADX INFO: renamed from: b */
    public final xq21 f248610b;

    /* JADX INFO: renamed from: c */
    public final gmc f248611c;

    /* JADX INFO: renamed from: d */
    public final say0 f248612d;

    /* JADX INFO: renamed from: e */
    public final boolean f248613e;

    /* JADX INFO: renamed from: f */
    public final Map f248614f;

    public w791(l9y l9yVar, xq21 xq21Var, gmc gmcVar, say0 say0Var, boolean z, Map map) {
        this.f248609a = l9yVar;
        this.f248610b = xq21Var;
        this.f248611c = gmcVar;
        this.f248612d = say0Var;
        this.f248613e = z;
        this.f248614f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w791)) {
            return false;
        }
        w791 w791Var = (w791) obj;
        return wj50.m88271j(this.f248609a, w791Var.f248609a) && wj50.m88271j(this.f248610b, w791Var.f248610b) && wj50.m88271j(this.f248611c, w791Var.f248611c) && wj50.m88271j(this.f248612d, w791Var.f248612d) && this.f248613e == w791Var.f248613e && wj50.m88271j(this.f248614f, w791Var.f248614f);
    }

    public final int hashCode() {
        l9y l9yVar = this.f248609a;
        int iHashCode = (l9yVar == null ? 0 : l9yVar.hashCode()) * 31;
        xq21 xq21Var = this.f248610b;
        int iHashCode2 = (iHashCode + (xq21Var == null ? 0 : xq21Var.hashCode())) * 31;
        gmc gmcVar = this.f248611c;
        int iHashCode3 = (iHashCode2 + (gmcVar == null ? 0 : gmcVar.hashCode())) * 31;
        say0 say0Var = this.f248612d;
        return this.f248614f.hashCode() + s571.m77245d((iHashCode3 + (say0Var != null ? say0Var.hashCode() : 0)) * 961, 31, this.f248613e);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f248609a + ", slide=" + this.f248610b + ", changeSize=" + this.f248611c + ", scale=" + this.f248612d + ", veil=null, hold=" + this.f248613e + ", effectsMap=" + this.f248614f + ')';
    }

    public /* synthetic */ w791(l9y l9yVar, xq21 xq21Var, gmc gmcVar, say0 say0Var, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : l9yVar, (i & 2) != 0 ? null : xq21Var, (i & 4) != 0 ? null : gmcVar, (i & 8) != 0 ? null : say0Var, (i & 32) == 0, (i & 64) != 0 ? nau.f152117a : linkedHashMap);
    }
}
