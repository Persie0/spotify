package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qjn0 {

    /* JADX INFO: renamed from: a */
    public final String f189272a;

    public qjn0(String str) {
        this.f189272a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m72930a() {
        return this.f189272a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qjn0) && wj50.m88271j(this.f189272a, ((qjn0) obj).f189272a);
    }

    public final int hashCode() {
        return ame.f17112c.hashCode() + f710.m40938f(5, this.f189272a.hashCode() * 31, 31);
    }
}
