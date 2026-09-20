package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ouj {

    /* JADX INFO: renamed from: a */
    public final int f170303a;

    /* JADX INFO: renamed from: b */
    public final int f170304b;

    public ouj(int i, int i2) {
        this.f170303a = i;
        this.f170304b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ouj)) {
            return false;
        }
        ouj oujVar = (ouj) obj;
        return this.f170303a == oujVar.f170303a && this.f170304b == oujVar.f170304b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f170304b) + (Integer.hashCode(this.f170303a) * 31);
    }
}
