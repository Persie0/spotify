package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class cs80 implements ds80 {

    /* JADX INFO: renamed from: a */
    public final bs80 f41491a;

    public cs80(bs80 bs80Var) {
        this.f41491a = bs80Var;
    }

    @Override // p204p.ds80
    /* JADX INFO: renamed from: a */
    public final bs80 mo33758a() {
        return this.f41491a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cs80) && wj50.m88271j(this.f41491a, ((cs80) obj).f41491a);
    }

    public final int hashCode() {
        return this.f41491a.hashCode();
    }
}
