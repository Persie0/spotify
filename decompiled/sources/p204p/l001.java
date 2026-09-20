package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class l001 implements z001 {

    /* JADX INFO: renamed from: a */
    public final String f128250a;

    public l001(String str) {
        this.f128250a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l001) && wj50.m88271j(this.f128250a, ((l001) obj).f128250a);
    }

    public final int hashCode() {
        return this.f128250a.hashCode();
    }
}
