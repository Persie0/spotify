package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hwo0 {

    /* JADX INFO: renamed from: a */
    public final String f96000a;

    public hwo0(String str) {
        this.f96000a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hwo0) && wj50.m88271j(this.f96000a, ((hwo0) obj).f96000a);
    }

    public final int hashCode() {
        return this.f96000a.hashCode();
    }
}
