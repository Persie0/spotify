package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bxh implements cxh {

    /* JADX INFO: renamed from: a */
    public final String f31864a;

    public bxh(String str) {
        this.f31864a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bxh) && wj50.m88271j(this.f31864a, ((bxh) obj).f31864a);
    }

    public final int hashCode() {
        return this.f31864a.hashCode();
    }
}
