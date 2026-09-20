package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rqh implements yqh {

    /* JADX INFO: renamed from: a */
    public final String f201834a;

    public rqh(String str) {
        this.f201834a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rqh) && wj50.m88271j(this.f201834a, ((rqh) obj).f201834a);
    }

    public final int hashCode() {
        return this.f201834a.hashCode();
    }
}
