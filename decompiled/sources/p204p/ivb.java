package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ivb extends kvb {

    /* JADX INFO: renamed from: a */
    public final String f106182a;

    public ivb(String str) {
        this.f106182a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ivb) && wj50.m88271j(this.f106182a, ((ivb) obj).f106182a);
    }

    public final int hashCode() {
        return this.f106182a.hashCode();
    }
}
