package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class bmj {

    /* JADX INFO: renamed from: a */
    public final ibj f28565a;

    /* JADX INFO: renamed from: b */
    public final boolean f28566b;

    /* JADX INFO: renamed from: c */
    public final boolean f28567c;

    public bmj(ibj ibjVar, boolean z, boolean z2) {
        this.f28565a = ibjVar;
        this.f28566b = z;
        this.f28567c = z2;
    }

    /* JADX INFO: renamed from: a */
    public static bmj m29862a(ibj ibjVar) {
        return new bmj(ibjVar, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmj)) {
            return false;
        }
        bmj bmjVar = (bmj) obj;
        return wj50.m88271j(this.f28565a, bmjVar.f28565a) && this.f28566b == bmjVar.f28566b && this.f28567c == bmjVar.f28567c;
    }

    public final int hashCode() {
        ibj ibjVar = this.f28565a;
        return Boolean.hashCode(this.f28567c) + s571.m77245d((ibjVar == null ? 0 : ibjVar.hashCode()) * 31, 31, this.f28566b);
    }
}
