package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xsu0 implements ysu0 {

    /* JADX INFO: renamed from: a */
    public final String f265676a;

    public xsu0(String str) {
        this.f265676a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xsu0) && wj50.m88271j(this.f265676a, ((xsu0) obj).f265676a);
    }

    public final int hashCode() {
        return this.f265676a.hashCode();
    }
}
