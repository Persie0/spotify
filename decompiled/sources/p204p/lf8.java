package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class lf8 implements pf8 {

    /* JADX INFO: renamed from: a */
    public final String f132844a;

    public lf8(String str) {
        this.f132844a = str;
    }

    @Override // p204p.pf8
    /* JADX INFO: renamed from: a */
    public final String mo38720a() {
        return this.f132844a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lf8) && wj50.m88271j(this.f132844a, ((lf8) obj).f132844a);
    }

    public final int hashCode() {
        return this.f132844a.hashCode();
    }
}
