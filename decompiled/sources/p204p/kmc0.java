package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class kmc0 extends nmc0 {

    /* JADX INFO: renamed from: a */
    public final String f124109a;

    public kmc0(String str) {
        this.f124109a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kmc0) && wj50.m88271j(this.f124109a, ((kmc0) obj).f124109a);
    }

    public final int hashCode() {
        return this.f124109a.hashCode();
    }
}
