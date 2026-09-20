package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ro6 implements to6 {

    /* JADX INFO: renamed from: a */
    public final String f201086a;

    public ro6(String str) {
        this.f201086a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m76016a() {
        return this.f201086a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ro6) && wj50.m88271j(this.f201086a, ((ro6) obj).f201086a);
    }

    public final int hashCode() {
        return this.f201086a.hashCode();
    }
}
