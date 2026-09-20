package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class s3r0 {

    /* JADX INFO: renamed from: a */
    public final String f205322a;

    /* JADX INFO: renamed from: b */
    public final wwu f205323b;

    /* JADX INFO: renamed from: c */
    public final boolean f205324c;

    public /* synthetic */ s3r0(int i, String str, wwu wwuVar) {
        this((i & 2) != 0 ? null : wwuVar, str, (i & 4) == 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3r0)) {
            return false;
        }
        s3r0 s3r0Var = (s3r0) obj;
        return wj50.m88271j(this.f205322a, s3r0Var.f205322a) && wj50.m88271j(this.f205323b, s3r0Var.f205323b) && this.f205324c == s3r0Var.f205324c;
    }

    public final int hashCode() {
        int iHashCode = this.f205322a.hashCode() * 31;
        wwu wwuVar = this.f205323b;
        return Boolean.hashCode(this.f205324c) + ((iHashCode + (wwuVar == null ? 0 : wwuVar.hashCode())) * 31);
    }

    public s3r0(wwu wwuVar, String str, boolean z) {
        this.f205322a = str;
        this.f205323b = wwuVar;
        this.f205324c = z;
    }
}
