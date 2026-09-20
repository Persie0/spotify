package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class kwz0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Integer f127276a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ i6o f127277b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lwz0 f127278c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kwz0(Integer num, i6o i6oVar, lwz0 lwz0Var) {
        super(0);
        this.f127276a = num;
        this.f127277b = i6oVar;
        this.f127278c = lwz0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        lwz0 lwz0Var = this.f127278c;
        i6o i6oVar = this.f127277b;
        Integer num = this.f127276a;
        if (num != null) {
            i6oVar.startForeground(28, lwz0Var.m60133a(), num.intValue());
        } else {
            i6oVar.startForeground(28, lwz0Var.m60133a());
        }
        return w2a1.f247311a;
    }
}
