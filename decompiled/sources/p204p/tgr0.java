package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tgr0 implements qob {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f220241a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ai00 f220242b;

    public /* synthetic */ tgr0(ai00 ai00Var, int i) {
        this.f220241a = i;
        this.f220242b = ai00Var;
    }

    @Override // p204p.qob
    /* JADX INFO: renamed from: a */
    public final Object mo73384a(rgr0 rgr0Var, cx50 cx50Var, o0q o0qVar) {
        switch (this.f220241a) {
            case 0:
                return Boolean.valueOf(!((Boolean) ((gh00) this.f220242b).invoke(cx50Var)).booleanValue());
            default:
                ya60 ya60Var = (ya60) ((eh00) this.f220242b).invoke();
                return Boolean.valueOf((ya60Var != null ? ya60Var.f270817c : null) == null);
        }
    }
}
