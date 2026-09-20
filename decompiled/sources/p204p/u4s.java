package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class u4s {

    /* JADX INFO: renamed from: a */
    public final s4s f226791a;

    /* JADX INFO: renamed from: b */
    public final boolean f226792b;

    /* JADX INFO: renamed from: c */
    public final boolean f226793c;

    public u4s(s4s s4sVar, boolean z, boolean z2) {
        this.f226791a = s4sVar;
        this.f226792b = z;
        this.f226793c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4s)) {
            return false;
        }
        u4s u4sVar = (u4s) obj;
        return wj50.m88271j(this.f226791a, u4sVar.f226791a) && this.f226792b == u4sVar.f226792b && this.f226793c == u4sVar.f226793c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f226793c) + s571.m77245d(this.f226791a.hashCode() * 31, 31, this.f226792b);
    }
}
