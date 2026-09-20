package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bz10 {

    /* JADX INFO: renamed from: a */
    public final String f32344a;

    /* JADX INFO: renamed from: b */
    public final boolean f32345b;

    public bz10(String str, boolean z) {
        this.f32344a = str;
        this.f32345b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz10)) {
            return false;
        }
        bz10 bz10Var = (bz10) obj;
        return wj50.m88271j(this.f32344a, bz10Var.f32344a) && this.f32345b == bz10Var.f32345b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f32345b) + (this.f32344a.hashCode() * 31);
    }
}
