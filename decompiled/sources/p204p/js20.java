package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class js20 {

    /* JADX INFO: renamed from: a */
    public final String f115365a;

    /* JADX INFO: renamed from: b */
    public final String f115366b;

    /* JADX INFO: renamed from: c */
    public final List f115367c;

    /* JADX INFO: renamed from: d */
    public final String f115368d;

    /* JADX INFO: renamed from: e */
    public final qro0 f115369e;

    public js20(String str, String str2, List list, String str3, qro0 qro0Var) {
        this.f115365a = str;
        this.f115366b = str2;
        this.f115367c = list;
        this.f115368d = str3;
        this.f115369e = qro0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof js20)) {
            return false;
        }
        js20 js20Var = (js20) obj;
        return wj50.m88271j(this.f115365a, js20Var.f115365a) && wj50.m88271j(this.f115366b, js20Var.f115366b) && wj50.m88271j(this.f115367c, js20Var.f115367c) && wj50.m88271j(this.f115368d, js20Var.f115368d) && wj50.m88271j(this.f115369e, js20Var.f115369e);
    }

    public final int hashCode() {
        return this.f115369e.hashCode() + s571.m77243b(s571.m77244c(s571.m77243b(this.f115365a.hashCode() * 31, 31, this.f115366b), 31, this.f115367c), 31, this.f115368d);
    }
}
