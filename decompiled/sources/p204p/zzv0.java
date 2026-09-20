package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class zzv0 extends b0w0 {

    /* JADX INFO: renamed from: a */
    public final int f288120a;

    /* JADX INFO: renamed from: b */
    public final String f288121b;

    public zzv0(int i, String str) {
        this.f288120a = i;
        this.f288121b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzv0)) {
            return false;
        }
        zzv0 zzv0Var = (zzv0) obj;
        return this.f288120a == zzv0Var.f288120a && wj50.m88271j(this.f288121b, zzv0Var.f288121b);
    }

    public final int hashCode() {
        return this.f288121b.hashCode() + (Integer.hashCode(this.f288120a) * 31);
    }
}
