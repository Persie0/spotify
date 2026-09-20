package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class wvi extends dwi {

    /* JADX INFO: renamed from: a */
    public final fat0 f255501a;

    /* JADX INFO: renamed from: b */
    public final boolean f255502b;

    public wvi(fat0 fat0Var, boolean z) {
        this.f255501a = fat0Var;
        this.f255502b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wvi)) {
            return false;
        }
        wvi wviVar = (wvi) obj;
        return this.f255501a.equals(wviVar.f255501a) && this.f255502b == wviVar.f255502b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f255502b) + (this.f255501a.hashCode() * 31);
    }
}
