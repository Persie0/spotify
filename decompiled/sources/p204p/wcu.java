package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wcu {

    /* JADX INFO: renamed from: a */
    public final String f250113a;

    public wcu(String str) {
        this.f250113a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wcu) && wj50.m88271j(this.f250113a, ((wcu) obj).f250113a);
    }

    public final int hashCode() {
        return this.f250113a.hashCode();
    }
}
