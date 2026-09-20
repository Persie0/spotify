package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class whx {

    /* JADX INFO: renamed from: b */
    public static final whx f251456b;

    /* JADX INFO: renamed from: c */
    public static final whx f251457c;

    /* JADX INFO: renamed from: a */
    public final w791 f251458a;

    static {
        LinkedHashMap linkedHashMap = null;
        l9y l9yVar = null;
        xq21 xq21Var = null;
        gmc gmcVar = null;
        say0 say0Var = null;
        f251456b = new whx(new w791(l9yVar, xq21Var, gmcVar, say0Var, linkedHashMap, 127));
        f251457c = new whx(new w791(l9yVar, xq21Var, gmcVar, say0Var, linkedHashMap, 95));
    }

    public whx(w791 w791Var) {
        this.f251458a = w791Var;
    }

    /* JADX INFO: renamed from: a */
    public final whx m88177a(whx whxVar) {
        w791 w791Var = whxVar.f251458a;
        l9y l9yVar = w791Var.f248609a;
        w791 w791Var2 = this.f251458a;
        if (l9yVar == null) {
            l9yVar = w791Var2.f248609a;
        }
        xq21 xq21Var = w791Var.f248610b;
        if (xq21Var == null) {
            xq21Var = w791Var2.f248610b;
        }
        gmc gmcVar = w791Var.f248611c;
        if (gmcVar == null) {
            gmcVar = w791Var2.f248611c;
        }
        say0 say0Var = w791Var.f248612d;
        if (say0Var == null) {
            say0Var = w791Var2.f248612d;
        }
        return new whx(new w791(l9yVar, xq21Var, gmcVar, say0Var, w791Var.f248613e || w791Var2.f248613e, kkc0.m56700m0(w791Var2.f248614f, w791Var.f248614f)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof whx) && wj50.m88271j(((whx) obj).f251458a, this.f251458a);
    }

    public final int hashCode() {
        return this.f251458a.hashCode();
    }

    public final String toString() {
        if (equals(f251456b)) {
            return "ExitTransition.None";
        }
        if (equals(f251457c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        w791 w791Var = this.f251458a;
        l9y l9yVar = w791Var.f248609a;
        sb.append(l9yVar != null ? l9yVar.toString() : null);
        sb.append(",\nSlide - ");
        xq21 xq21Var = w791Var.f248610b;
        sb.append(xq21Var != null ? xq21Var.toString() : null);
        sb.append(",\nShrink - ");
        gmc gmcVar = w791Var.f248611c;
        sb.append(gmcVar != null ? gmcVar.toString() : null);
        sb.append(",\nScale - ");
        say0 say0Var = w791Var.f248612d;
        sb.append(say0Var != null ? say0Var.toString() : null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(w791Var.f248613e);
        return sb.toString();
    }
}
