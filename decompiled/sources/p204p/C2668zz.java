package p204p;

import java.util.List;

/* JADX INFO: renamed from: p.zz */
/* JADX INFO: loaded from: classes7.dex */
public final class C2668zz implements i10 {

    /* JADX INFO: renamed from: a */
    public final tvi0 f287744a;

    /* JADX INFO: renamed from: b */
    public final List f287745b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2631yz f287746c;

    public C2668zz(tvi0 tvi0Var, List list, InterfaceC2631yz interfaceC2631yz) {
        this.f287744a = tvi0Var;
        this.f287745b = list;
        this.f287746c = interfaceC2631yz;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2668zz)) {
            return false;
        }
        C2668zz c2668zz = (C2668zz) obj;
        return wj50.m88271j(this.f287744a, c2668zz.f287744a) && wj50.m88271j(this.f287745b, c2668zz.f287745b) && wj50.m88271j(this.f287746c, c2668zz.f287746c);
    }

    public final int hashCode() {
        return this.f287746c.hashCode() + s571.m77244c(this.f287744a.hashCode() * 31, 31, this.f287745b);
    }
}
