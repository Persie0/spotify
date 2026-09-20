package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class rfe {

    /* JADX INFO: renamed from: a */
    public final vfe f198624a;

    /* JADX INFO: renamed from: b */
    public final kfe f198625b;

    public rfe(vfe vfeVar, kfe kfeVar) {
        this.f198624a = vfeVar;
        this.f198625b = kfeVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rfe) {
            return wj50.m88271j(this.f198624a, ((rfe) obj).f198624a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f198624a.hashCode();
    }
}
