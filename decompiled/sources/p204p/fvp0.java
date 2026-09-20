package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class fvp0 implements he41 {

    /* JADX INFO: renamed from: e */
    public static final iup0 f73833e = new iup0(21);

    /* JADX INFO: renamed from: a */
    public final String f73834a;

    /* JADX INFO: renamed from: b */
    public final Map f73835b;

    /* JADX INFO: renamed from: c */
    public final String f73836c;

    /* JADX INFO: renamed from: d */
    public final String f73837d;

    public fvp0(Map map, String str, String str2, String str3) {
        this.f73834a = str;
        this.f73835b = map;
        this.f73836c = str2;
        this.f73837d = str3;
    }

    @Override // p204p.he41
    /* JADX INFO: renamed from: a */
    public final int mo27216a() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvp0)) {
            return false;
        }
        fvp0 fvp0Var = (fvp0) obj;
        return wj50.m88271j(this.f73834a, fvp0Var.f73834a) && wj50.m88271j(this.f73835b, fvp0Var.f73835b) && wj50.m88271j(this.f73836c, fvp0Var.f73836c) && wj50.m88271j(this.f73837d, fvp0Var.f73837d);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f73833e;
    }

    public final int hashCode() {
        int iM38557f = edb.m38557f(this.f73834a.hashCode() * 31, 31, this.f73835b);
        String str = this.f73836c;
        return this.f73837d.hashCode() + ((iM38557f + (str == null ? 0 : str.hashCode())) * 31);
    }
}
