package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tbd {

    /* JADX INFO: renamed from: a */
    public final String f218822a;

    /* JADX INFO: renamed from: b */
    public final qf40 f218823b;

    public tbd(String str, qf40 qf40Var) {
        this.f218822a = str;
        this.f218823b = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tbd)) {
            return false;
        }
        tbd tbdVar = (tbd) obj;
        return wj50.m88271j(this.f218822a, tbdVar.f218822a) && wj50.m88271j(this.f218823b, tbdVar.f218823b);
    }

    public final int hashCode() {
        return this.f218823b.hashCode() + (this.f218822a.hashCode() * 31);
    }
}
