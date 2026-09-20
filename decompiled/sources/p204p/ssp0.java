package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ssp0 implements usp0 {

    /* JADX INFO: renamed from: a */
    public final String f213690a;

    public ssp0(String str) {
        this.f213690a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ssp0) && wj50.m88271j(this.f213690a, ((ssp0) obj).f213690a);
    }

    public final int hashCode() {
        return this.f213690a.hashCode();
    }
}
