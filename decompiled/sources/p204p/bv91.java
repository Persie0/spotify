package p204p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class bv91 implements f2b1 {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f31311e = 0;

    /* JADX INFO: renamed from: a */
    public final String f31312a;

    /* JADX INFO: renamed from: b */
    public final int f31313b;

    /* JADX INFO: renamed from: c */
    public final Map f31314c;

    /* JADX INFO: renamed from: d */
    public final List f31315d;

    static {
        new bv91("", 0, nau.f152117a);
    }

    public bv91(String str, int i, Map map, List list) {
        this.f31312a = str;
        this.f31313b = i;
        this.f31314c = kkc0.m56706s0(map);
        this.f31315d = g6f.m43728j1(list);
    }

    @Override // p204p.f2b1
    /* JADX INFO: renamed from: a */
    public final List mo30507a() {
        String str = this.f31312a;
        int length = str.length();
        List list = this.f31315d;
        int i = this.f31313b;
        if (length > 0 && i > 0 && list.isEmpty()) {
            return lau.f131415a;
        }
        ro80 ro80VarM44508o = geg1.m44508o();
        if (str.length() == 0) {
            ro80VarM44508o.add("Empty action id");
        }
        if (i <= 0) {
            ro80VarM44508o.add("Non-positive version");
        }
        ro80VarM44508o.addAll(list);
        return geg1.m44506m(ro80VarM44508o);
    }

    /* JADX INFO: renamed from: b */
    public final String m30591b() {
        return this.f31312a;
    }

    /* JADX INFO: renamed from: c */
    public final Map m30592c() {
        return this.f31314c;
    }

    /* JADX INFO: renamed from: d */
    public final int m30593d() {
        return this.f31313b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv91)) {
            return false;
        }
        bv91 bv91Var = (bv91) obj;
        return wj50.m88271j(this.f31312a, bv91Var.f31312a) && this.f31313b == bv91Var.f31313b && wj50.m88271j(this.f31314c, bv91Var.f31314c);
    }

    public final int hashCode() {
        return this.f31314c.hashCode() + (((this.f31312a.hashCode() * 31) + this.f31313b) * 31);
    }

    public final String toString() {
        return "UbiInteractionEventAction(name=" + this.f31312a + ", version=" + this.f31313b + ", parameters=" + this.f31314c + ')';
    }

    public bv91(String str, int i, Map map) {
        this(str, i, map, lau.f131415a);
    }
}
