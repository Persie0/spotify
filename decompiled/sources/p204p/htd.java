package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class htd extends ktd {

    /* JADX INFO: renamed from: a */
    public final String f94983a;

    /* JADX INFO: renamed from: b */
    public final int f94984b;

    public htd(String str, int i) {
        this.f94983a = str;
        this.f94984b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof htd)) {
            return false;
        }
        htd htdVar = (htd) obj;
        return wj50.m88271j(this.f94983a, htdVar.f94983a) && this.f94984b == htdVar.f94984b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f94984b) + (this.f94983a.hashCode() * 31);
    }
}
