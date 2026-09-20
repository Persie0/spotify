package p204p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class dv91 implements f2b1 {

    /* JADX INFO: renamed from: a */
    public final String f53399a;

    /* JADX INFO: renamed from: b */
    public final int f53400b;

    /* JADX INFO: renamed from: c */
    public final Map f53401c = kkc0.m56706s0(nau.f152117a);

    static {
        new dv91("", 0);
    }

    public dv91(String str, int i) {
        this.f53399a = str;
        this.f53400b = i;
    }

    @Override // p204p.f2b1
    /* JADX INFO: renamed from: a */
    public final List mo30507a() {
        String str = this.f53399a;
        int length = str.length();
        int i = this.f53400b;
        if (length > 0 && i > 0) {
            return lau.f131415a;
        }
        ro80 ro80VarM44508o = geg1.m44508o();
        if (str.length() == 0) {
            ro80VarM44508o.add("Empty interaction type");
        }
        if (i <= 0) {
            ro80VarM44508o.add("Non-positive version");
        }
        return geg1.m44506m(ro80VarM44508o);
    }

    /* JADX INFO: renamed from: b */
    public final String m37077b() {
        return this.f53399a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv91)) {
            return false;
        }
        dv91 dv91Var = (dv91) obj;
        return wj50.m88271j(this.f53399a, dv91Var.f53399a) && this.f53400b == dv91Var.f53400b && wj50.m88271j(this.f53401c, dv91Var.f53401c);
    }

    public final int hashCode() {
        return this.f53401c.hashCode() + (((this.f53399a.hashCode() * 31) + this.f53400b) * 31);
    }

    public final String toString() {
        return "UbiInteractionEventType(name=" + this.f53399a + ", version=" + this.f53400b + ", parameters=" + this.f53401c + ')';
    }
}
