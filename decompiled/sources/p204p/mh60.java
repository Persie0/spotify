package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class mh60 implements nh60 {

    /* JADX INFO: renamed from: a */
    public final vj60 f143714a;

    /* JADX INFO: renamed from: b */
    public final String f143715b;

    /* JADX INFO: renamed from: c */
    public final Set f143716c;

    public mh60(vj60 vj60Var, String str, Set set) {
        this.f143714a = vj60Var;
        this.f143715b = str;
        this.f143716c = set;
    }

    @Override // p204p.nh60
    /* JADX INFO: renamed from: b */
    public final vj60 mo58958b() {
        return this.f143714a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mh60)) {
            return false;
        }
        mh60 mh60Var = (mh60) obj;
        return wj50.m88271j(this.f143714a, mh60Var.f143714a) && wj50.m88271j(this.f143715b, mh60Var.f143715b) && wj50.m88271j(this.f143716c, mh60Var.f143716c);
    }

    public final int hashCode() {
        return this.f143716c.hashCode() + s571.m77243b(this.f143714a.hashCode() * 31, 31, this.f143715b);
    }
}
