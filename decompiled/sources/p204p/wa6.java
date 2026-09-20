package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class wa6 implements qh0 {

    /* JADX INFO: renamed from: a */
    public final String f249402a;

    public wa6(String str) {
        this.f249402a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wa6) && wj50.m88271j(this.f249402a, ((wa6) obj).f249402a);
    }

    public final int hashCode() {
        return this.f249402a.hashCode();
    }
}
