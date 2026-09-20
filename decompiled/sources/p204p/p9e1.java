package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class p9e1 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f175221a;

    /* JADX INFO: renamed from: b */
    public jsi0 f175222b;

    /* JADX INFO: renamed from: c */
    public q9e1 f175223c;

    /* JADX INFO: renamed from: d */
    public String f175224d;

    /* JADX INFO: renamed from: e */
    public boolean f175225e;

    /* JADX INFO: renamed from: f */
    public int f175226f;

    /* JADX INFO: renamed from: g */
    public int f175227g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ q9e1 f175228h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f175229i;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ boolean f175230t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p9e1(q9e1 q9e1Var, String str, boolean z, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f175221a = i;
        this.f175228h = q9e1Var;
        this.f175229i = str;
        this.f175230t = z;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f175221a) {
            case 0:
                return new p9e1(this.f175228h, this.f175229i, this.f175230t, fbkVar, 0);
            case 1:
                return new p9e1(this.f175228h, this.f175229i, this.f175230t, fbkVar, 1);
            default:
                return new p9e1(this.f175228h, this.f175229i, this.f175230t, fbkVar, 2);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f175221a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((p9e1) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12, types: [p.jsi0] */
    /* JADX WARN: Type inference failed for: r0v16, types: [p.jsi0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [p.jsi0] */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r0v22, types: [p.jsi0] */
    /* JADX WARN: Type inference failed for: r0v26, types: [p.jsi0] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v6, types: [p.jsi0] */
    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        q9e1 q9e1Var;
        String str;
        int i;
        boolean z;
        jsi0 jsi0Var;
        q9e1 q9e1Var2;
        String str2;
        int i2;
        boolean z2;
        jsi0 jsi0Var2;
        q9e1 q9e1Var3;
        String str3;
        int i3;
        boolean z3;
        jsi0 jsi0Var3;
        switch (this.f175221a) {
            case 0:
                ?? r0 = this.f175227g;
                yuk yukVar = yuk.f276404a;
                try {
                    if (r0 != 0) {
                        if (r0 == 1) {
                            int i4 = this.f175226f;
                            z = this.f175225e;
                            str = this.f175224d;
                            q9e1Var = this.f175223c;
                            jsi0 jsi0Var4 = this.f175222b;
                            bga.m29073P(obj);
                            i = i4;
                            jsi0Var = jsi0Var4;
                        } else {
                            if (r0 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            jsi0 jsi0Var5 = this.f175222b;
                            bga.m29073P(obj);
                            r0 = jsi0Var5;
                        }
                        r0.mo54249c(null);
                        return w2a1.f247311a;
                    }
                    bga.m29073P(obj);
                    q9e1Var = this.f175228h;
                    lsi0 lsi0Var = q9e1Var.f186582d;
                    this.f175222b = lsi0Var;
                    this.f175223c = q9e1Var;
                    str = this.f175229i;
                    this.f175224d = str;
                    boolean z4 = this.f175230t;
                    this.f175225e = z4;
                    i = 0;
                    this.f175226f = 0;
                    this.f175227g = 1;
                    if (lsi0Var.mo54248a(this) == yukVar) {
                        return yukVar;
                    }
                    z = z4;
                    jsi0Var = lsi0Var;
                    fv31 fv31Var = w3e1.f247577b;
                    this.f175222b = jsi0Var;
                    this.f175223c = null;
                    this.f175224d = null;
                    this.f175226f = i;
                    this.f175227g = 2;
                    r0 = jsi0Var;
                    if (q9e1.m72362b(q9e1Var, fv31Var, str, z, this) == yukVar) {
                        return yukVar;
                    }
                    r0.mo54249c(null);
                    return w2a1.f247311a;
                } catch (Throwable th) {
                    r0.mo54249c(null);
                    throw th;
                }
            case 1:
                ?? r1 = this.f175227g;
                yuk yukVar2 = yuk.f276404a;
                try {
                    if (r1 != 0) {
                        if (r1 == 1) {
                            int i5 = this.f175226f;
                            z2 = this.f175225e;
                            str2 = this.f175224d;
                            q9e1Var2 = this.f175223c;
                            jsi0 jsi0Var6 = this.f175222b;
                            bga.m29073P(obj);
                            i2 = i5;
                            jsi0Var2 = jsi0Var6;
                        } else {
                            if (r1 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            jsi0 jsi0Var7 = this.f175222b;
                            bga.m29073P(obj);
                            r1 = jsi0Var7;
                        }
                        r1.mo54249c(null);
                        return w2a1.f247311a;
                    }
                    bga.m29073P(obj);
                    q9e1Var2 = this.f175228h;
                    lsi0 lsi0Var2 = q9e1Var2.f186582d;
                    this.f175222b = lsi0Var2;
                    this.f175223c = q9e1Var2;
                    str2 = this.f175229i;
                    this.f175224d = str2;
                    boolean z5 = this.f175230t;
                    this.f175225e = z5;
                    i2 = 0;
                    this.f175226f = 0;
                    this.f175227g = 1;
                    if (lsi0Var2.mo54248a(this) == yukVar2) {
                        return yukVar2;
                    }
                    z2 = z5;
                    jsi0Var2 = lsi0Var2;
                    this.f175222b = jsi0Var2;
                    this.f175223c = null;
                    this.f175224d = null;
                    this.f175226f = i2;
                    this.f175227g = 2;
                    r1 = jsi0Var2;
                    if (q9e1.m72361a(q9e1Var2, str2, z2, this) == yukVar2) {
                        return yukVar2;
                    }
                    r1.mo54249c(null);
                    return w2a1.f247311a;
                } catch (Throwable th2) {
                    r1.mo54249c(null);
                    throw th2;
                }
            default:
                ?? r2 = this.f175227g;
                yuk yukVar3 = yuk.f276404a;
                try {
                    if (r2 != 0) {
                        if (r2 == 1) {
                            int i6 = this.f175226f;
                            z3 = this.f175225e;
                            str3 = this.f175224d;
                            q9e1Var3 = this.f175223c;
                            jsi0 jsi0Var8 = this.f175222b;
                            bga.m29073P(obj);
                            i3 = i6;
                            jsi0Var3 = jsi0Var8;
                        } else {
                            if (r2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            jsi0 jsi0Var9 = this.f175222b;
                            bga.m29073P(obj);
                            r2 = jsi0Var9;
                        }
                        r2.mo54249c(null);
                        return w2a1.f247311a;
                    }
                    bga.m29073P(obj);
                    q9e1Var3 = this.f175228h;
                    lsi0 lsi0Var3 = q9e1Var3.f186582d;
                    this.f175222b = lsi0Var3;
                    this.f175223c = q9e1Var3;
                    str3 = this.f175229i;
                    this.f175224d = str3;
                    boolean z6 = this.f175230t;
                    this.f175225e = z6;
                    i3 = 0;
                    this.f175226f = 0;
                    this.f175227g = 1;
                    if (lsi0Var3.mo54248a(this) == yukVar3) {
                        return yukVar3;
                    }
                    z3 = z6;
                    jsi0Var3 = lsi0Var3;
                    fv31 fv31Var2 = w3e1.f247576a;
                    this.f175222b = jsi0Var3;
                    this.f175223c = null;
                    this.f175224d = null;
                    this.f175226f = i3;
                    this.f175227g = 2;
                    r2 = jsi0Var3;
                    if (q9e1.m72362b(q9e1Var3, fv31Var2, str3, z3, this) == yukVar3) {
                        return yukVar3;
                    }
                    r2.mo54249c(null);
                    return w2a1.f247311a;
                } catch (Throwable th3) {
                    r2.mo54249c(null);
                    throw th3;
                }
        }
    }
}
