package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class me8 implements re8 {

    /* JADX INFO: renamed from: a */
    public final String f142628a;

    public me8(String str) {
        this.f142628a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof me8) && wj50.m88271j(this.f142628a, ((me8) obj).f142628a);
    }

    public final int hashCode() {
        return this.f142628a.hashCode();
    }
}
