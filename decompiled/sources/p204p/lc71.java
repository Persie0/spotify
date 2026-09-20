package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lc71 implements nc71 {

    /* JADX INFO: renamed from: a */
    public final String f131870a;

    public lc71(String str) {
        this.f131870a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lc71) && wj50.m88271j(this.f131870a, ((lc71) obj).f131870a);
    }

    public final int hashCode() {
        return this.f131870a.hashCode();
    }
}
