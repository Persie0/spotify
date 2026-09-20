package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jvb extends kvb {

    /* JADX INFO: renamed from: a */
    public final String f116295a;

    public jvb(String str) {
        this.f116295a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jvb) && wj50.m88271j(this.f116295a, ((jvb) obj).f116295a);
    }

    public final int hashCode() {
        return this.f116295a.hashCode();
    }
}
