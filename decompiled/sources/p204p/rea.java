package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rea {

    /* JADX INFO: renamed from: a */
    public final String f198325a;

    /* JADX INFO: renamed from: b */
    public final String f198326b;

    public rea(String str, String str2) {
        this.f198325a = str;
        this.f198326b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rea)) {
            return false;
        }
        rea reaVar = (rea) obj;
        return wj50.m88271j(this.f198325a, reaVar.f198325a) && wj50.m88271j(this.f198326b, reaVar.f198326b);
    }

    public final int hashCode() {
        return this.f198326b.hashCode() + (this.f198325a.hashCode() * 31);
    }
}
