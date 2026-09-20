package p204p;

/* JADX INFO: renamed from: p.fn */
/* JADX INFO: loaded from: classes4.dex */
public final class C1866fn {

    /* JADX INFO: renamed from: a */
    public final String f71137a;

    public C1866fn(String str) {
        this.f71137a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1866fn) && wj50.m88271j(this.f71137a, ((C1866fn) obj).f71137a);
    }

    public final int hashCode() {
        return this.f71137a.hashCode();
    }
}
