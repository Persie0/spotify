package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class av91 extends rt91 {

    /* JADX INFO: renamed from: d */
    public final cv91 f20129d;

    public av91(cv91 cv91Var, long j, List list) {
        super(cv91Var.m34013d().m27169a(), cv91Var.m34013d().m27170b(), j, list);
        this.f20129d = cv91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof av91) {
            return wj50.m88271j(this.f20129d, ((av91) obj).f20129d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20129d.hashCode();
    }

    @Override // p204p.rt91
    public final String toString() {
        return "interaction = " + this.f20129d.m34010a() + ' ' + super.toString();
    }

    public av91(String str, String str2, dv91 dv91Var, bv91 bv91Var, zt91 zt91Var, st91 st91Var, long j) {
        this(new cv91(str, str2, new au91(zt91Var, st91Var), dv91Var, bv91Var), j, lau.f131415a);
    }
}
