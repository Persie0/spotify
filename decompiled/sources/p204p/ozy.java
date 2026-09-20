package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ozy extends pzy {

    /* JADX INFO: renamed from: a */
    public final qug0 f172381a;

    /* JADX INFO: renamed from: b */
    public final int f172382b;

    public ozy(qug0 qug0Var, int i) {
        this.f172381a = qug0Var;
        this.f172382b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ozy)) {
            return false;
        }
        ozy ozyVar = (ozy) obj;
        return this.f172381a == ozyVar.f172381a && this.f172382b == ozyVar.f172382b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f172382b) + (this.f172381a.hashCode() * 31);
    }
}
