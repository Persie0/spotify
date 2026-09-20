package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class efy0 implements jfy0 {

    /* JADX INFO: renamed from: a */
    public final String f59174a;

    public efy0(String str) {
        this.f59174a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof efy0) && wj50.m88271j(this.f59174a, ((efy0) obj).f59174a);
    }

    public final int hashCode() {
        return this.f59174a.hashCode();
    }
}
