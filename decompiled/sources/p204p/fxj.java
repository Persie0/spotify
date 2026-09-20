package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fxj implements hxj {

    /* JADX INFO: renamed from: a */
    public final String f74383a;

    public fxj(String str) {
        this.f74383a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fxj) && wj50.m88271j(this.f74383a, ((fxj) obj).f74383a);
    }

    public final int hashCode() {
        return this.f74383a.hashCode();
    }
}
