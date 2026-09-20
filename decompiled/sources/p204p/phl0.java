package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class phl0 implements shl0 {

    /* JADX INFO: renamed from: a */
    public final String f177681a;

    public phl0(String str) {
        this.f177681a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof phl0) && wj50.m88271j(this.f177681a, ((phl0) obj).f177681a);
    }

    public final int hashCode() {
        return this.f177681a.hashCode();
    }
}
