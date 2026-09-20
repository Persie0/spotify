package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ybq extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f271229a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zbq f271230b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ybq(zbq zbqVar, int i) {
        super(0);
        this.f271229a = i;
        this.f271230b = zbqVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f271229a) {
            case 0:
                zbq zbqVar = this.f271230b;
                gh00 gh00Var = zbqVar.f281367d;
                if (gh00Var != null) {
                    gh00Var.invoke(zbqVar);
                }
                break;
            case 1:
                eh00 eh00Var = this.f271230b.f281377n;
                if (eh00Var != null) {
                    eh00Var.invoke();
                }
                break;
            default:
                eh00 eh00Var2 = this.f271230b.f281368e;
                if (eh00Var2 != null) {
                    eh00Var2.invoke();
                }
                break;
        }
        return w2a1.f247311a;
    }
}
