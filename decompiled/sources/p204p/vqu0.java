package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vqu0 extends mb61 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f244001a;

    /* JADX INFO: renamed from: b */
    public int f244002b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ long f244003c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ long f244004d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ yqu0 f244005e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vqu0(yqu0 yqu0Var, fbk fbkVar, int i) {
        super(3, fbkVar);
        this.f244001a = i;
        this.f244005e = yqu0Var;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        Number number = (Number) obj;
        switch (this.f244001a) {
            case 0:
                long jLongValue = number.longValue();
                long jLongValue2 = ((Number) obj2).longValue();
                vqu0 vqu0Var = new vqu0(this.f244005e, (fbk) obj3, 0);
                vqu0Var.f244003c = jLongValue;
                vqu0Var.f244004d = jLongValue2;
                return vqu0Var.invokeSuspend(w2a1.f247311a);
            default:
                long jLongValue3 = number.longValue();
                long jLongValue4 = ((Number) obj2).longValue();
                vqu0 vqu0Var2 = new vqu0(this.f244005e, (fbk) obj3, 1);
                vqu0Var2.f244003c = jLongValue3;
                vqu0Var2.f244004d = jLongValue4;
                return vqu0Var2.invokeSuspend(w2a1.f247311a);
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f244001a) {
            case 0:
                long j = this.f244003c;
                long j2 = this.f244004d;
                int i = this.f244002b;
                if (i == 0) {
                    bga.m29073P(obj);
                    Boolean bool = Boolean.FALSE;
                    this.f244003c = j;
                    this.f244004d = j2;
                    this.f244002b = 1;
                    Object objM94395d = yqu0.m94395d(this.f244005e, null, j, j2, bool, null, this, 17);
                    yuk yukVar = yuk.f276404a;
                    if (objM94395d == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            default:
                long j3 = this.f244003c;
                long j4 = this.f244004d;
                int i2 = this.f244002b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    Boolean bool2 = Boolean.TRUE;
                    this.f244003c = j3;
                    this.f244004d = j4;
                    this.f244002b = 1;
                    Object objM94395d2 = yqu0.m94395d(this.f244005e, null, j3, j4, bool2, null, this, 17);
                    yuk yukVar2 = yuk.f276404a;
                    if (objM94395d2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
        }
    }
}
