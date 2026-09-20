package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class cl51 implements e15 {

    /* JADX INFO: renamed from: a */
    public final String f39190a;

    public /* synthetic */ cl51(String str) {
        this.f39190a = str;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ cl51 m33218a(String str) {
        return new cl51(str);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String m33219b() {
        return this.f39190a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cl51) {
            return wj50.m88271j(this.f39190a, ((cl51) obj).f39190a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39190a.hashCode();
    }

    public final String toString() {
        return dq60.m36608h(')', "StringAnnotation(value=", this.f39190a);
    }
}
