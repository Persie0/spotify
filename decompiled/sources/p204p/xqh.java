package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xqh implements yqh {

    /* JADX INFO: renamed from: a */
    public final String f265051a;

    public xqh(String str) {
        this.f265051a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xqh) && wj50.m88271j(this.f265051a, ((xqh) obj).f265051a);
    }

    public final int hashCode() {
        return this.f265051a.hashCode();
    }
}
