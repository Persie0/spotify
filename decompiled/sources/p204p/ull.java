package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ull extends hhi implements eoj0 {

    /* JADX INFO: renamed from: b */
    public final coj0 f231581b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f231582c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ull(coj0 coj0Var, int i) {
        super(coj0Var);
        this.f231582c = i;
        this.f231581b = coj0Var;
    }

    @Override // p204p.hhi, p204p.avt
    /* JADX INFO: renamed from: b */
    public final Object mo26460b(Object obj, Object obj2, Object obj3, b250 b250Var) {
        return this.f231581b.mo26460b(obj, obj2, obj3, b250Var);
    }

    @Override // p204p.hhi
    /* JADX INFO: renamed from: e */
    public final boolean mo47536e(Object obj) {
        switch (this.f231582c) {
            case 0:
                qla1 qla1Var = ((lll) obj).f134657a;
                String str = qla1Var != null ? qla1Var.f189802a : null;
                return !(str == null || str.length() == 0);
            default:
                qla1 qla1Var2 = ((v9t) obj).f239032c;
                String str2 = qla1Var2 != null ? qla1Var2.f189802a : null;
                return !(str2 == null || str2.length() == 0);
        }
    }
}
