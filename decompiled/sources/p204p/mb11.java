package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class mb11 implements pb11 {

    /* JADX INFO: renamed from: a */
    public final nvr f141764a;

    public mb11(nvr nvrVar) {
        this.f141764a = nvrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mb11) && wj50.m88271j(this.f141764a, ((mb11) obj).f141764a);
    }

    public final int hashCode() {
        nvr nvrVar = this.f141764a;
        if (nvrVar == null) {
            return 0;
        }
        return nvrVar.hashCode();
    }
}
