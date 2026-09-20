package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sez0 {

    /* JADX INFO: renamed from: a */
    public final String f208415a;

    public sez0(String str) {
        this.f208415a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sez0) && wj50.m88271j(this.f208415a, ((sez0) obj).f208415a);
    }

    public final int hashCode() {
        String str = this.f208415a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
