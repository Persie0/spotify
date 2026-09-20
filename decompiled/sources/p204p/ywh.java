package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ywh implements cxh {

    /* JADX INFO: renamed from: a */
    public final String f276968a;

    /* JADX INFO: renamed from: b */
    public final hxw0 f276969b;

    public ywh(String str, hxw0 hxw0Var) {
        this.f276968a = str;
        this.f276969b = hxw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ywh)) {
            return false;
        }
        ywh ywhVar = (ywh) obj;
        return wj50.m88271j(this.f276968a, ywhVar.f276968a) && wj50.m88271j(this.f276969b, ywhVar.f276969b);
    }

    public final int hashCode() {
        int iHashCode = this.f276968a.hashCode() * 31;
        hxw0 hxw0Var = this.f276969b;
        return iHashCode + (hxw0Var == null ? 0 : hxw0Var.hashCode());
    }
}
