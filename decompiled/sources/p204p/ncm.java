package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ncm implements qcm {

    /* JADX INFO: renamed from: a */
    public final String f152558a;

    public ncm(String str) {
        this.f152558a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ncm) && wj50.m88271j(this.f152558a, ((ncm) obj).f152558a);
    }

    @Override // p204p.qcm
    public final String getMessage() {
        return this.f152558a;
    }

    public final int hashCode() {
        String str = this.f152558a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
