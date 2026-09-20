package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tqe {

    /* JADX INFO: renamed from: a */
    public final String f222803a;

    public tqe(String str) {
        this.f222803a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tqe) && wj50.m88271j(this.f222803a, ((tqe) obj).f222803a);
    }

    public final int hashCode() {
        return this.f222803a.hashCode();
    }
}
