package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class nb11 implements pb11 {

    /* JADX INFO: renamed from: a */
    public final nvr f152162a;

    public nb11(nvr nvrVar) {
        this.f152162a = nvrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nb11) && wj50.m88271j(this.f152162a, ((nb11) obj).f152162a);
    }

    public final int hashCode() {
        nvr nvrVar = this.f152162a;
        if (nvrVar == null) {
            return 0;
        }
        return nvrVar.hashCode();
    }
}
