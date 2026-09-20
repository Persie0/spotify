package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class rxv0 implements uxv0 {

    /* JADX INFO: renamed from: a */
    public final String f203739a;

    /* JADX INFO: renamed from: b */
    public final String f203740b;

    public rxv0(String str, String str2) {
        this.f203739a = str;
        this.f203740b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rxv0)) {
            return false;
        }
        rxv0 rxv0Var = (rxv0) obj;
        return wj50.m88271j(this.f203739a, rxv0Var.f203739a) && wj50.m88271j(this.f203740b, rxv0Var.f203740b);
    }

    public final int hashCode() {
        return this.f203740b.hashCode() + (this.f203739a.hashCode() * 31);
    }
}
