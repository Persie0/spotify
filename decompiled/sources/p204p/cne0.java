package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class cne0 implements ene0 {

    /* JADX INFO: renamed from: a */
    public final String f39989a;

    public cne0(String str) {
        this.f39989a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cne0) && wj50.m88271j(this.f39989a, ((cne0) obj).f39989a);
    }

    public final int hashCode() {
        return this.f39989a.hashCode();
    }
}
