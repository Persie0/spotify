package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kbe0 implements lbe0 {

    /* JADX INFO: renamed from: a */
    public final String f121192a;

    public kbe0(String str) {
        this.f121192a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kbe0) && wj50.m88271j(this.f121192a, ((kbe0) obj).f121192a);
    }

    public final int hashCode() {
        return this.f121192a.hashCode();
    }
}
