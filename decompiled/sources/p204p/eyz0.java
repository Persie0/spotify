package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class eyz0 implements gyz0 {

    /* JADX INFO: renamed from: a */
    public final String f64231a;

    public eyz0(String str) {
        this.f64231a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eyz0) && wj50.m88271j(this.f64231a, ((eyz0) obj).f64231a);
    }

    public final int hashCode() {
        return this.f64231a.hashCode();
    }
}
