package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class efc0 implements ffc0 {

    /* JADX INFO: renamed from: a */
    public final long f59020a;

    public efc0(long j) {
        this.f59020a = j;
    }

    @Override // p204p.ffc0
    /* JADX INFO: renamed from: a */
    public final long mo35879a() {
        return this.f59020a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efc0)) {
            return false;
        }
        long j = ((efc0) obj).f59020a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f59020a, j);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return Long.hashCode(this.f59020a);
    }
}
