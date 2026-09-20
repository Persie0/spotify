package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class say implements qfm0 {

    /* JADX INFO: renamed from: a */
    public final zam0 f207288a;

    /* JADX INFO: renamed from: b */
    public final voc1 f207289b;

    public say(zam0 zam0Var, voc1 voc1Var) {
        this.f207288a = zam0Var;
        this.f207289b = voc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof say)) {
            return false;
        }
        say sayVar = (say) obj;
        return wj50.m88271j(this.f207288a, sayVar.f207288a) && wj50.m88271j(this.f207289b, sayVar.f207289b);
    }

    public final int hashCode() {
        return this.f207289b.f243453a.hashCode() + (this.f207288a.hashCode() * 31);
    }
}
