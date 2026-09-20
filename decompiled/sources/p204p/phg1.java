package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class phg1 extends mb61 implements gh00 {

    /* JADX INFO: renamed from: a */
    public int f177660a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f177661b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rig1 f177662c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public phg1(long j, fbk fbkVar, rig1 rig1Var) {
        super(1, fbkVar);
        this.f177661b = j;
        this.f177662c = rig1Var;
    }

    @Override // p204p.ly8
    public final fbk create(fbk fbkVar) {
        return new phg1(this.f177661b, fbkVar, this.f177662c);
    }

    @Override // p204p.gh00
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((phg1) create((fbk) obj)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        int i = this.f177660a;
        bga.m29073P(obj);
        if (i == 0) {
            pwb1 pwb1Var = new pwb1(this.f177662c, null, 27);
            this.f177660a = 1;
            Object objM76978s = s1h1.m76978s(this.f177661b, pwb1Var, this);
            yuk yukVar = yuk.f276404a;
            if (objM76978s == yukVar) {
                return yukVar;
            }
        }
        return w2a1.f247311a;
    }
}
