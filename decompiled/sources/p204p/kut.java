package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class kut {

    /* JADX INFO: renamed from: a */
    public final String f126676a;

    public kut(String str) {
        this.f126676a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kut) && wj50.m88271j(this.f126676a, ((kut) obj).f126676a);
    }

    public final int hashCode() {
        return this.f126676a.hashCode();
    }
}
