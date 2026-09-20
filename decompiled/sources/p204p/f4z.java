package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class f4z implements h4z {

    /* JADX INFO: renamed from: a */
    public final i4z f65855a;

    /* JADX INFO: renamed from: b */
    public final j4z f65856b;

    public f4z(i4z i4zVar, j4z j4zVar) {
        this.f65855a = i4zVar;
        this.f65856b = j4zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4z)) {
            return false;
        }
        f4z f4zVar = (f4z) obj;
        return wj50.m88271j(this.f65855a, f4zVar.f65855a) && wj50.m88271j(this.f65856b, f4zVar.f65856b);
    }

    public final int hashCode() {
        return this.f65856b.hashCode() + (this.f65855a.hashCode() * 31);
    }
}
