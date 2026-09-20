package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class b75 extends o400 {

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ m75 f24163X;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ j75 f24164t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b75(m75 m75Var, m75 m75Var2, j75 j75Var) {
        super(m75Var2);
        this.f24163X = m75Var;
        this.f24164t = j75Var;
    }

    @Override // p204p.o400
    /* JADX INFO: renamed from: b */
    public final ft11 mo28357b() {
        return this.f24164t;
    }

    @Override // p204p.o400
    /* JADX INFO: renamed from: c */
    public final boolean mo28358c() {
        m75 m75Var = this.f24163X;
        if (m75Var.getInternalPopup().mo40949a()) {
            return true;
        }
        m75Var.f140666f.mo40957i(d75.m35181b(m75Var), d75.m35180a(m75Var));
        return true;
    }
}
