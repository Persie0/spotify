package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gm81 {

    /* JADX INFO: renamed from: a */
    public final String f81331a;

    /* JADX INFO: renamed from: b */
    public final String f81332b;

    public gm81(String str, String str2) {
        this.f81331a = str;
        this.f81332b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm81)) {
            return false;
        }
        gm81 gm81Var = (gm81) obj;
        return wj50.m88271j(this.f81331a, gm81Var.f81331a) && wj50.m88271j(this.f81332b, gm81Var.f81332b);
    }

    public final int hashCode() {
        return this.f81332b.hashCode() + (this.f81331a.hashCode() * 31);
    }
}
