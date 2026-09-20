package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class fkv {

    /* JADX INFO: renamed from: a */
    public final String f70625a;

    /* JADX INFO: renamed from: b */
    public final boolean f70626b;

    public fkv(String str, boolean z, int i) {
        z = (i & 4) != 0 ? false : z;
        this.f70625a = str;
        this.f70626b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fkv)) {
            return false;
        }
        fkv fkvVar = (fkv) obj;
        return wj50.m88271j(this.f70625a, fkvVar.f70625a) && this.f70626b == fkvVar.f70626b;
    }

    public final int hashCode() {
        return edb.m38547C(2) + s571.m77245d(this.f70625a.hashCode() * 961, 31, this.f70626b);
    }
}
