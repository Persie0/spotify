package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class dsa {

    /* JADX INFO: renamed from: a */
    public final Object f52525a;

    /* JADX INFO: renamed from: b */
    public final String f52526b;

    public dsa(Object obj, String str) {
        this.f52525a = obj;
        this.f52526b = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m36754a() {
        return "[" + this.f52526b + ", " + gsa.m45635i(this.f52525a.getClass()) + "]";
    }

    public final String toString() {
        return m36754a();
    }
}
