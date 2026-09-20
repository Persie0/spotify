package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class o8t implements p8t {

    /* JADX INFO: renamed from: a */
    public final a3b1 f162865a;

    /* JADX INFO: renamed from: b */
    public final String f162866b;

    public o8t(a3b1 a3b1Var, String str) {
        this.f162865a = a3b1Var;
        this.f162866b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8t)) {
            return false;
        }
        o8t o8tVar = (o8t) obj;
        return wj50.m88271j(this.f162865a, o8tVar.f162865a) && wj50.m88271j(this.f162866b, o8tVar.f162866b);
    }

    public final int hashCode() {
        return this.f162866b.hashCode() + (this.f162865a.hashCode() * 31);
    }
}
