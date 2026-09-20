package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class xi2 implements yi2 {

    /* JADX INFO: renamed from: a */
    public final String f261750a;

    public xi2(String str) {
        this.f261750a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xi2) && wj50.m88271j(this.f261750a, ((xi2) obj).f261750a);
    }

    public final int hashCode() {
        return this.f261750a.hashCode();
    }
}
