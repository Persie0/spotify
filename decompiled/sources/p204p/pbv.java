package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class pbv {

    /* JADX INFO: renamed from: b */
    public static final pbv f175910b = new pbv(new w791((l9y) null, (xq21) null, (gmc) null, (say0) null, (LinkedHashMap) null, 127));

    /* JADX INFO: renamed from: a */
    public final w791 f175911a;

    public pbv(w791 w791Var) {
        this.f175911a = w791Var;
    }

    /* JADX INFO: renamed from: a */
    public final pbv m69539a(pbv pbvVar) {
        w791 w791Var = pbvVar.f175911a;
        l9y l9yVar = w791Var.f248609a;
        w791 w791Var2 = this.f175911a;
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
        return new pbv(new w791(l9yVar, xq21Var, gmcVar, say0Var, kkc0.m56700m0(w791Var2.f248614f, w791Var.f248614f), 32));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof pbv) && wj50.m88271j(((pbv) obj).f175911a, this.f175911a);
    }

    public final int hashCode() {
        return this.f175911a.hashCode();
    }

    public final String toString() {
        if (equals(f175910b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        w791 w791Var = this.f175911a;
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
        return sb.toString();
    }
}
