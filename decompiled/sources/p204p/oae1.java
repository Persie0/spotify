package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class oae1 {

    /* JADX INFO: renamed from: a */
    public final boolean f163317a;

    /* JADX INFO: renamed from: b */
    public final boolean f163318b;

    public oae1(boolean z, boolean z2) {
        this.f163317a = z;
        this.f163318b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oae1)) {
            return false;
        }
        oae1 oae1Var = (oae1) obj;
        return this.f163317a == oae1Var.f163317a && this.f163318b == oae1Var.f163318b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f163318b) + (Boolean.hashCode(this.f163317a) * 31);
    }
}
