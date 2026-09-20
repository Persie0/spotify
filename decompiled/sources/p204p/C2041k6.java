package p204p;

/* JADX INFO: renamed from: p.k6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2041k6 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f119603a;

    /* JADX INFO: renamed from: b */
    public int f119604b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ voi0 f119605c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ m3r0 f119606d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2041k6(voi0 voi0Var, m3r0 m3r0Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f119603a = i;
        this.f119605c = voi0Var;
        this.f119606d = m3r0Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f119603a) {
            case 0:
                return new C2041k6(this.f119606d, this.f119605c, fbkVar);
            case 1:
                return new C2041k6(this.f119605c, this.f119606d, fbkVar, 1);
            default:
                return new C2041k6(this.f119605c, this.f119606d, fbkVar, 2);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f119603a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C2041k6) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f119603a) {
            case 0:
                int i = this.f119604b;
                if (i == 0) {
                    bga.m29073P(obj);
                    n3r0 n3r0Var = new n3r0(this.f119606d);
                    this.f119604b = 1;
                    Object objMo86073b = this.f119605c.mo86073b(n3r0Var, this);
                    yuk yukVar = yuk.f276404a;
                    if (objMo86073b == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 1:
                int i2 = this.f119604b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    this.f119604b = 1;
                    Object objMo86073b2 = this.f119605c.mo86073b(this.f119606d, this);
                    yuk yukVar2 = yuk.f276404a;
                    if (objMo86073b2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            default:
                int i3 = this.f119604b;
                if (i3 == 0) {
                    bga.m29073P(obj);
                    this.f119604b = 1;
                    Object objMo86073b3 = this.f119605c.mo86073b(this.f119606d, this);
                    yuk yukVar3 = yuk.f276404a;
                    if (objMo86073b3 == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2041k6(m3r0 m3r0Var, voi0 voi0Var, fbk fbkVar) {
        super(2, fbkVar);
        this.f119603a = 0;
        this.f119606d = m3r0Var;
        this.f119605c = voi0Var;
    }
}
