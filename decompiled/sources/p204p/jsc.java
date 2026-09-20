package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jsc {

    /* JADX INFO: renamed from: a */
    public final String f115472a;

    public jsc(String str) {
        this.f115472a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jsc) && wj50.m88271j(this.f115472a, ((jsc) obj).f115472a);
    }

    public final int hashCode() {
        String str = this.f115472a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
