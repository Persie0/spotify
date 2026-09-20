package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ttc extends duc {

    /* JADX INFO: renamed from: a */
    public final duc f223571a;

    /* JADX INFO: renamed from: b */
    public final duc f223572b;

    public ttc(duc ducVar, duc ducVar2) {
        ducVar.getClass();
        this.f223571a = ducVar;
        ducVar2.getClass();
        this.f223572b = ducVar2;
    }

    @Override // p204p.wfq0
    public final boolean apply(Object obj) {
        return mo27173e(((Character) obj).charValue());
    }

    @Override // p204p.duc
    /* JADX INFO: renamed from: e */
    public final boolean mo27173e(char c) {
        return this.f223571a.mo27173e(c) && this.f223572b.mo27173e(c);
    }

    public final String toString() {
        return "CharMatcher.and(" + this.f223571a + ", " + this.f223572b + ")";
    }
}
