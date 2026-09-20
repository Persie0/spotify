package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rrc {

    /* JADX INFO: renamed from: a */
    public final String f202014a;

    /* JADX INFO: renamed from: b */
    public final int f202015b;

    public rrc(String str, int i) {
        this.f202014a = str;
        this.f202015b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rrc)) {
            return false;
        }
        rrc rrcVar = (rrc) obj;
        return wj50.m88271j(this.f202014a, rrcVar.f202014a) && this.f202015b == rrcVar.f202015b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f202015b) + (this.f202014a.hashCode() * 31);
    }
}
