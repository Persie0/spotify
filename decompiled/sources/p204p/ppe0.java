package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ppe0 implements wpe0 {

    /* JADX INFO: renamed from: a */
    public final String f180021a;

    /* JADX INFO: renamed from: b */
    public final String f180022b;

    public ppe0(String str, String str2) {
        this.f180021a = str;
        this.f180022b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppe0)) {
            return false;
        }
        ppe0 ppe0Var = (ppe0) obj;
        return wj50.m88271j(this.f180021a, ppe0Var.f180021a) && wj50.m88271j(this.f180022b, ppe0Var.f180022b);
    }

    public final int hashCode() {
        return this.f180022b.hashCode() + (this.f180021a.hashCode() * 31);
    }
}
