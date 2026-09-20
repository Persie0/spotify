package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sxv0 implements uxv0 {

    /* JADX INFO: renamed from: a */
    public final String f215059a;

    public sxv0(String str) {
        this.f215059a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sxv0) && wj50.m88271j(this.f215059a, ((sxv0) obj).f215059a);
    }

    public final int hashCode() {
        return this.f215059a.hashCode();
    }
}
