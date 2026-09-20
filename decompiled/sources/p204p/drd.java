package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class drd {

    /* JADX INFO: renamed from: a */
    public final String f52299a;

    /* JADX INFO: renamed from: b */
    public final String f52300b;

    public drd(String str, String str2) {
        this.f52299a = str;
        this.f52300b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drd)) {
            return false;
        }
        drd drdVar = (drd) obj;
        return wj50.m88271j(this.f52299a, drdVar.f52299a) && wj50.m88271j(this.f52300b, drdVar.f52300b);
    }

    public final int hashCode() {
        return this.f52300b.hashCode() + (this.f52299a.hashCode() * 31);
    }
}
