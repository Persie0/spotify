package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gtd {

    /* JADX INFO: renamed from: a */
    public final String f84143a;

    /* JADX INFO: renamed from: b */
    public final xcl0 f84144b;

    /* JADX INFO: renamed from: c */
    public final ktd f84145c;

    public gtd(String str, xcl0 xcl0Var, ktd ktdVar) {
        this.f84143a = str;
        this.f84144b = xcl0Var;
        this.f84145c = ktdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtd)) {
            return false;
        }
        gtd gtdVar = (gtd) obj;
        return wj50.m88271j(this.f84143a, gtdVar.f84143a) && wj50.m88271j(this.f84144b, gtdVar.f84144b) && wj50.m88271j(this.f84145c, gtdVar.f84145c);
    }

    public final int hashCode() {
        return this.f84145c.hashCode() + ((this.f84144b.hashCode() + (this.f84143a.hashCode() * 31)) * 31);
    }
}
