package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class wll implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f252574a;

    /* JADX INFO: renamed from: b */
    public final String f252575b;

    public wll(String str, String str2) {
        this.f252574a = str;
        this.f252575b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wll)) {
            return false;
        }
        wll wllVar = (wll) obj;
        return wj50.m88271j(this.f252574a, wllVar.f252574a) && wj50.m88271j(this.f252575b, wllVar.f252575b);
    }

    public final int hashCode() {
        return this.f252575b.hashCode() + (this.f252574a.hashCode() * 31);
    }
}
