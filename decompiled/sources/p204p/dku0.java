package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class dku0 implements qku0 {

    /* JADX INFO: renamed from: a */
    public final String f50026a;

    public dku0(String str) {
        this.f50026a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dku0) && wj50.m88271j(this.f50026a, ((dku0) obj).f50026a);
    }

    public final int hashCode() {
        return this.f50026a.hashCode();
    }
}
