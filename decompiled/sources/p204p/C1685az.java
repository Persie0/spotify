package p204p;

import java.util.List;

/* JADX INFO: renamed from: p.az */
/* JADX INFO: loaded from: classes7.dex */
public final class C1685az implements i10 {

    /* JADX INFO: renamed from: a */
    public final tvi0 f21382a;

    /* JADX INFO: renamed from: b */
    public final List f21383b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2667zy f21384c;

    public C1685az(tvi0 tvi0Var, List list, InterfaceC2667zy interfaceC2667zy) {
        this.f21382a = tvi0Var;
        this.f21383b = list;
        this.f21384c = interfaceC2667zy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1685az)) {
            return false;
        }
        C1685az c1685az = (C1685az) obj;
        return wj50.m88271j(this.f21382a, c1685az.f21382a) && wj50.m88271j(this.f21383b, c1685az.f21383b) && wj50.m88271j(this.f21384c, c1685az.f21384c);
    }

    public final int hashCode() {
        return this.f21384c.hashCode() + s571.m77244c(this.f21382a.hashCode() * 31, 31, this.f21383b);
    }
}
