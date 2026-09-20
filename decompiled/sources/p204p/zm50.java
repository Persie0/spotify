package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zm50 extends an50 {

    /* JADX INFO: renamed from: a */
    public final String f284161a;

    public zm50(String str) {
        this.f284161a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zm50) && wj50.m88271j(this.f284161a, ((zm50) obj).f284161a);
    }

    public final int hashCode() {
        return this.f284161a.hashCode();
    }
}
