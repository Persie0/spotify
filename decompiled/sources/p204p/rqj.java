package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rqj implements yqj {

    /* JADX INFO: renamed from: a */
    public final String f201835a;

    public rqj(String str) {
        this.f201835a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rqj) && wj50.m88271j(this.f201835a, ((rqj) obj).f201835a);
    }

    public final int hashCode() {
        return this.f201835a.hashCode();
    }
}
