package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class elf implements bmf {

    /* JADX INFO: renamed from: a */
    public final daa0 f60693a;

    public elf(daa0 daa0Var) {
        this.f60693a = daa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof elf) && wj50.m88271j(this.f60693a, ((elf) obj).f60693a);
    }

    public final int hashCode() {
        return this.f60693a.hashCode();
    }
}
