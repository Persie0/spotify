package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ilb implements mlb {

    /* JADX INFO: renamed from: a */
    public final String f103340a;

    public ilb(String str) {
        this.f103340a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m51007a() {
        return this.f103340a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ilb) && wj50.m88271j(this.f103340a, ((ilb) obj).f103340a);
    }

    public final int hashCode() {
        return this.f103340a.hashCode();
    }
}
