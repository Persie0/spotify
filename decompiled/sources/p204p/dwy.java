package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class dwy {

    /* JADX INFO: renamed from: a */
    public final int f53755a;

    /* JADX INFO: renamed from: b */
    public final int f53756b;

    /* JADX INFO: renamed from: c */
    public final String f53757c;

    public dwy(int i, int i2, String str) {
        this.f53755a = i;
        this.f53756b = i2;
        this.f53757c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwy)) {
            return false;
        }
        dwy dwyVar = (dwy) obj;
        return this.f53755a == dwyVar.f53755a && this.f53756b == dwyVar.f53756b && this.f53757c.equals(dwyVar.f53757c);
    }

    public final int hashCode() {
        return this.f53757c.hashCode() + f710.m40938f(this.f53756b, edb.m38547C(this.f53755a) * 31, 31);
    }
}
