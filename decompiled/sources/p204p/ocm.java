package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ocm implements qcm {

    /* JADX INFO: renamed from: a */
    public final String f163958a;

    public ocm(String str) {
        this.f163958a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ocm) && wj50.m88271j(this.f163958a, ((ocm) obj).f163958a);
    }

    @Override // p204p.qcm
    public final String getMessage() {
        return this.f163958a;
    }

    public final int hashCode() {
        String str = this.f163958a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
