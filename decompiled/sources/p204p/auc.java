package p204p;

/* JADX INFO: loaded from: classes4.dex */
public class auc extends duc {

    /* JADX INFO: renamed from: a */
    public final duc f19912a;

    public auc(duc ducVar) {
        ducVar.getClass();
        this.f19912a = ducVar;
    }

    @Override // p204p.wfq0
    public final boolean apply(Object obj) {
        return mo27173e(((Character) obj).charValue());
    }

    @Override // p204p.duc
    /* JADX INFO: renamed from: e */
    public final boolean mo27173e(char c) {
        return !this.f19912a.mo27173e(c);
    }

    @Override // p204p.duc
    /* JADX INFO: renamed from: f */
    public final duc mo27174f() {
        return this.f19912a;
    }

    public final String toString() {
        return this.f19912a + ".negate()";
    }
}
