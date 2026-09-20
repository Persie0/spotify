package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ap00 implements ep00 {

    /* JADX INFO: renamed from: a */
    public final String f17800a;

    public ap00(String str) {
        this.f17800a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ap00) && wj50.m88271j(this.f17800a, ((ap00) obj).f17800a);
    }

    public final int hashCode() {
        return this.f17800a.hashCode();
    }
}
