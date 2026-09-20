package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class rr11 implements hes0 {

    /* JADX INFO: renamed from: a */
    public final String f201922a;

    public rr11(String str) {
        this.f201922a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rr11) && wj50.m88271j(this.f201922a, ((rr11) obj).f201922a);
    }

    public final int hashCode() {
        return this.f201922a.hashCode();
    }
}
