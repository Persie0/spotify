package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class mjo implements pjo {

    /* JADX INFO: renamed from: a */
    public final kjo f144297a;

    public mjo(kjo kjoVar) {
        this.f144297a = kjoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mjo) && wj50.m88271j(this.f144297a, ((mjo) obj).f144297a);
    }

    public final int hashCode() {
        return this.f144297a.hashCode();
    }
}
