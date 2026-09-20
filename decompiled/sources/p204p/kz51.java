package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class kz51 implements lz51 {

    /* JADX INFO: renamed from: a */
    public final String f128020a;

    public kz51(String str) {
        this.f128020a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kz51) && wj50.m88271j(this.f128020a, ((kz51) obj).f128020a);
    }

    public final int hashCode() {
        return this.f128020a.hashCode();
    }
}
