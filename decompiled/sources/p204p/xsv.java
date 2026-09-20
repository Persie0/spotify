package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xsv {

    /* JADX INFO: renamed from: e */
    public static final xsv f265677e = new xsv(null, 15);

    /* JADX INFO: renamed from: a */
    public final Integer f265678a;

    /* JADX INFO: renamed from: b */
    public final boolean f265679b;

    /* JADX INFO: renamed from: c */
    public final btv f265680c;

    /* JADX INFO: renamed from: d */
    public final wsv f265681d;

    public xsv(vsv vsvVar, int i) {
        Integer num = (i & 1) != 0 ? null : 3;
        boolean z = (i & 2) != 0;
        btv btvVar = (i & 4) != 0 ? zsv.f286003a : atv.f19749a;
        wsv wsvVar = (i & 8) != 0 ? usv.f233690a : vsvVar;
        this.f265678a = num;
        this.f265679b = z;
        this.f265680c = btvVar;
        this.f265681d = wsvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xsv)) {
            return false;
        }
        xsv xsvVar = (xsv) obj;
        return wj50.m88271j(this.f265678a, xsvVar.f265678a) && this.f265679b == xsvVar.f265679b && wj50.m88271j(this.f265680c, xsvVar.f265680c) && wj50.m88271j(this.f265681d, xsvVar.f265681d);
    }

    public final int hashCode() {
        Integer num = this.f265678a;
        return this.f265681d.hashCode() + ((this.f265680c.hashCode() + s571.m77245d((num == null ? 0 : num.hashCode()) * 31, 31, this.f265679b)) * 31);
    }
}
