package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ji81 implements oi81 {

    /* JADX INFO: renamed from: a */
    public final String f112688a;

    public ji81(String str) {
        this.f112688a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ji81) && wj50.m88271j(this.f112688a, ((ji81) obj).f112688a);
    }

    public final int hashCode() {
        return this.f112688a.hashCode();
    }
}
