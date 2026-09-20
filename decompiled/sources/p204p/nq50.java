package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class nq50 extends fr50 {

    /* JADX INFO: renamed from: a */
    public final String f157127a;

    public nq50(String str) {
        this.f157127a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m65377a() {
        return this.f157127a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nq50) && wj50.m88271j(this.f157127a, ((nq50) obj).f157127a);
    }

    public final int hashCode() {
        return this.f157127a.hashCode();
    }
}
