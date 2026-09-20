package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class f530 extends mb61 implements gh00 {

    /* JADX INFO: renamed from: a */
    public int f65919a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ j530 f65920b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f65921c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ kaa0 f65922d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f65923e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f65924f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f65925g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f530(j530 j530Var, String str, kaa0 kaa0Var, boolean z, boolean z2, String str2, fbk fbkVar) {
        super(1, fbkVar);
        this.f65920b = j530Var;
        this.f65921c = str;
        this.f65922d = kaa0Var;
        this.f65923e = z;
        this.f65924f = z2;
        this.f65925g = str2;
    }

    @Override // p204p.ly8
    public final fbk create(fbk fbkVar) {
        return new f530(this.f65920b, this.f65921c, this.f65922d, this.f65923e, this.f65924f, this.f65925g, fbkVar);
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        return ((f530) create((fbk) obj)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        int i = this.f65919a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        j530 j530Var = this.f65920b;
        q530 q530Var = j530Var.f108854e;
        e530 e530Var = new e530(j530Var, this.f65921c, this.f65922d, this.f65923e, this.f65924f, this.f65925g, (fbk) null);
        this.f65919a = 1;
        Object objM44677p = gga.m44677p(q530Var, h630.f87989t, e530Var, this);
        yuk yukVar = yuk.f276404a;
        return objM44677p == yukVar ? yukVar : objM44677p;
    }
}
