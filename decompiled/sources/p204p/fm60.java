package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class fm60 extends s4x0 implements vh00 {

    /* JADX INFO: renamed from: b */
    public int f70966b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ gto f70967c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ hm60 f70968d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm60(hm60 hm60Var, fbk fbkVar) {
        super(3, fbkVar);
        this.f70968d = hm60Var;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        fm60 fm60Var = new fm60(this.f70968d, (fbk) obj3);
        fm60Var.f70967c = (gto) obj;
        return fm60Var.invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        hm60 hm60Var = this.f70968d;
        AbstractC1850f7 abstractC1850f7 = (AbstractC1850f7) hm60Var.f92847c;
        gto gtoVar = this.f70967c;
        int i = this.f70966b;
        if (i == 0) {
            bga.m29073P(obj);
            byte bM40901C = abstractC1850f7.m40901C();
            if (bM40901C == 1) {
                return hm60Var.m47930d(true);
            }
            if (bM40901C == 0) {
                return hm60Var.m47930d(false);
            }
            if (bM40901C != 6) {
                if (bM40901C == 8) {
                    return hm60Var.m47929c();
                }
                AbstractC1850f7.m40899w(abstractC1850f7, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.f70967c = null;
            this.f70966b = 1;
            obj = hm60.m47927a(hm60Var, gtoVar, this);
            yuk yukVar = yuk.f276404a;
            if (obj == yukVar) {
                return yukVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return (yk60) obj;
    }
}
