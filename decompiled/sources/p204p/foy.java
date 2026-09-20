package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class foy implements hoy {

    /* JADX INFO: renamed from: a */
    public final String f71641a;

    public foy(String str) {
        this.f71641a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof foy) && wj50.m88271j(this.f71641a, ((foy) obj).f71641a);
    }

    public final int hashCode() {
        return this.f71641a.hashCode();
    }
}
