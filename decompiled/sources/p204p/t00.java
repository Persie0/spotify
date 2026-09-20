package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class t00 implements h10 {

    /* JADX INFO: renamed from: a */
    public final uqz f215706a;

    public t00(uqz uqzVar) {
        this.f215706a = uqzVar;
    }

    /* JADX INFO: renamed from: a */
    public final uqz m79768a() {
        return this.f215706a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t00) && wj50.m88271j(this.f215706a, ((t00) obj).f215706a);
    }

    public final int hashCode() {
        uqz uqzVar = this.f215706a;
        if (uqzVar == null) {
            return 0;
        }
        return uqzVar.hashCode();
    }
}
