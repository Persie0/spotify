package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class k7x0 extends l7x0 {

    /* JADX INFO: renamed from: a */
    public final String f120208a;

    public k7x0(String str) {
        this.f120208a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k7x0) && wj50.m88271j(this.f120208a, ((k7x0) obj).f120208a);
    }

    public final int hashCode() {
        return this.f120208a.hashCode();
    }
}
