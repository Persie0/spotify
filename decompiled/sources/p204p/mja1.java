package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class mja1 {

    /* JADX INFO: renamed from: a */
    public final String f144213a;

    /* JADX INFO: renamed from: b */
    public final String f144214b;

    /* JADX INFO: renamed from: c */
    public final String f144215c;

    /* JADX INFO: renamed from: d */
    public final String f144216d;

    /* JADX INFO: renamed from: e */
    public final String f144217e;

    public mja1(String str, String str2, String str3, String str4, String str5) {
        this.f144213a = str;
        this.f144214b = str2;
        this.f144215c = str3;
        this.f144216d = str4;
        this.f144217e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mja1) && wj50.m88271j(((mja1) obj).f144213a, this.f144213a);
    }

    public final int hashCode() {
        return this.f144213a.hashCode();
    }

    public final String toString() {
        return this.f144213a;
    }
}
