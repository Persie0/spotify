package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fkc {

    /* JADX INFO: renamed from: a */
    public final String f70521a;

    /* JADX INFO: renamed from: b */
    public final boolean f70522b;

    /* JADX INFO: renamed from: c */
    public final int f70523c;

    public fkc(String str, boolean z, int i) {
        this.f70521a = str;
        this.f70522b = z;
        this.f70523c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fkc)) {
            return false;
        }
        fkc fkcVar = (fkc) obj;
        return this.f70521a.equals(fkcVar.f70521a) && this.f70522b == fkcVar.f70522b && this.f70523c == fkcVar.f70523c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f70523c) + s571.m77245d(this.f70521a.hashCode() * 31, 31, this.f70522b);
    }
}
