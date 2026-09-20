package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class eq50 extends fr50 {

    /* JADX INFO: renamed from: a */
    public final String f61792a;

    public eq50(String str) {
        this.f61792a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m39721a() {
        return this.f61792a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eq50) && wj50.m88271j(this.f61792a, ((eq50) obj).f61792a);
    }

    public final int hashCode() {
        return this.f61792a.hashCode();
    }
}
