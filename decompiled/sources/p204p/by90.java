package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class by90 {

    /* JADX INFO: renamed from: a */
    public final String f32113a;

    /* JADX INFO: renamed from: b */
    public final String f32114b;

    /* JADX INFO: renamed from: c */
    public final boolean f32115c;

    public by90(String str, String str2, boolean z) {
        this.f32113a = str;
        this.f32114b = str2;
        this.f32115c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof by90)) {
            return false;
        }
        by90 by90Var = (by90) obj;
        return wj50.m88271j(this.f32113a, by90Var.f32113a) && wj50.m88271j(this.f32114b, by90Var.f32114b) && this.f32115c == by90Var.f32115c;
    }

    public final int hashCode() {
        int iHashCode = this.f32113a.hashCode() * 31;
        String str = this.f32114b;
        return Boolean.hashCode(this.f32115c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
