package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class v6z implements wfq0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f237991a;

    /* JADX INFO: renamed from: b */
    public final Object f237992b;

    public /* synthetic */ v6z(Object obj, int i) {
        this.f237991a = i;
        this.f237992b = obj;
    }

    @Override // p204p.wfq0
    public final boolean apply(Object obj) {
        switch (this.f237991a) {
            case 0:
                d0w d0wVar = (d0w) obj;
                ((so3) this.f237992b).getClass();
                if (d0wVar != null) {
                    Integer num = d0wVar.f44086r;
                    String str = d0wVar.f44070b;
                    if ((str != null && str.length() != 0) || num == null || d0wVar.f44085q - num.intValue() < 30) {
                        return true;
                    }
                }
                return false;
            default:
                fod0 fod0Var = (fod0) obj;
                return fod0Var != null && fod0Var.mo42271b((String) this.f237992b);
        }
    }
}
