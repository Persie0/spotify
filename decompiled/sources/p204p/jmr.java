package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jmr {

    /* JADX INFO: renamed from: a */
    public final String f113931a;

    public jmr(String str) {
        this.f113931a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jmr) && wj50.m88271j(this.f113931a, ((jmr) obj).f113931a);
    }

    public final int hashCode() {
        String str = this.f113931a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
