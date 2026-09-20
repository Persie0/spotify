package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hf8 implements pf8 {

    /* JADX INFO: renamed from: a */
    public final String f90624a;

    public hf8(String str) {
        this.f90624a = str;
    }

    @Override // p204p.pf8
    /* JADX INFO: renamed from: a */
    public final String mo38720a() {
        return this.f90624a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hf8) && wj50.m88271j(this.f90624a, ((hf8) obj).f90624a);
    }

    public final int hashCode() {
        return this.f90624a.hashCode();
    }
}
