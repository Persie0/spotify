package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class sxb0 implements dqk0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f214868a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vxb0 f214869b;

    public /* synthetic */ sxb0(vxb0 vxb0Var, int i) {
        this.f214868a = i;
        this.f214869b = vxb0Var;
    }

    @Override // p204p.dqk0
    /* JADX INFO: renamed from: b */
    public final void mo31453b(Object obj) {
        switch (this.f214868a) {
            case 0:
                Integer num = (Integer) obj;
                wj50.m88279p(num);
                vxb0 vxb0Var = this.f214869b;
                vxb0Var.f245705c.m39516c(vxb0.f245702f[0], vxb0Var, num);
                break;
            default:
                eh00 eh00Var = (eh00) obj;
                wj50.m88279p(eh00Var);
                vxb0 vxb0Var2 = this.f214869b;
                vxb0Var2.f245707e.m39516c(vxb0.f245702f[2], vxb0Var2, eh00Var);
                break;
        }
    }
}
