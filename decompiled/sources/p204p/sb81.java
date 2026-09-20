package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class sb81 {

    /* JADX INFO: renamed from: a */
    public final String f207379a;

    /* JADX INFO: renamed from: b */
    public final float f207380b;

    public sb81(String str, float f) {
        this.f207379a = str;
        this.f207380b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb81)) {
            return false;
        }
        sb81 sb81Var = (sb81) obj;
        return wj50.m88271j(this.f207379a, sb81Var.f207379a) && Float.compare(this.f207380b, sb81Var.f207380b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f207380b) + (this.f207379a.hashCode() * 31);
    }
}
