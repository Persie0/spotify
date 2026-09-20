package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class v43 extends mb61 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f237027a;

    /* JADX INFO: renamed from: b */
    public int f237028b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ v6w0 f237029c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ d850 f237030d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ x43 f237031e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v43(x43 x43Var, fbk fbkVar, int i) {
        super(3, fbkVar);
        this.f237027a = i;
        this.f237031e = x43Var;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        v6w0 v6w0Var = (v6w0) obj;
        d850 d850Var = (d850) obj2;
        fbk fbkVar = (fbk) obj3;
        switch (this.f237027a) {
            case 0:
                v43 v43Var = new v43(this.f237031e, fbkVar, 0);
                v43Var.f237029c = v6w0Var;
                v43Var.f237030d = d850Var;
                return v43Var.invokeSuspend(w2a1.f247311a);
            case 1:
                v43 v43Var2 = new v43(this.f237031e, fbkVar, 1);
                v43Var2.f237029c = v6w0Var;
                v43Var2.f237030d = d850Var;
                return v43Var2.invokeSuspend(w2a1.f247311a);
            case 2:
                v43 v43Var3 = new v43(this.f237031e, fbkVar, 2);
                v43Var3.f237029c = v6w0Var;
                v43Var3.f237030d = d850Var;
                return v43Var3.invokeSuspend(w2a1.f247311a);
            default:
                v43 v43Var4 = new v43(this.f237031e, fbkVar, 3);
                v43Var4.f237029c = v6w0Var;
                v43Var4.f237030d = d850Var;
                return v43Var4.invokeSuspend(w2a1.f247311a);
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f237027a) {
            case 0:
                v6w0 v6w0Var = this.f237029c;
                d850 d850Var = this.f237030d;
                int i = this.f237028b;
                if (i == 0) {
                    bga.m29073P(obj);
                    this.f237029c = null;
                    this.f237030d = null;
                    this.f237028b = 1;
                    Object objM89825b = x43.m89825b(this.f237031e, v6w0Var, d850Var, this);
                    yuk yukVar = yuk.f276404a;
                    if (objM89825b == yukVar) {
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
                v6w0 v6w0Var2 = this.f237029c;
                d850 d850Var2 = this.f237030d;
                int i2 = this.f237028b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    this.f237029c = null;
                    this.f237030d = null;
                    this.f237028b = 1;
                    Object objM89825b2 = x43.m89825b(this.f237031e, v6w0Var2, d850Var2, this);
                    yuk yukVar2 = yuk.f276404a;
                    if (objM89825b2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 2:
                v6w0 v6w0Var3 = this.f237029c;
                d850 d850Var3 = this.f237030d;
                int i3 = this.f237028b;
                if (i3 == 0) {
                    bga.m29073P(obj);
                    this.f237029c = null;
                    this.f237030d = null;
                    this.f237028b = 1;
                    Object objM89826c = x43.m89826c(this.f237031e, v6w0Var3, d850Var3, this);
                    yuk yukVar3 = yuk.f276404a;
                    if (objM89826c == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            default:
                v6w0 v6w0Var4 = this.f237029c;
                d850 d850Var4 = this.f237030d;
                int i4 = this.f237028b;
                if (i4 == 0) {
                    bga.m29073P(obj);
                    this.f237029c = null;
                    this.f237030d = null;
                    this.f237028b = 1;
                    Object objM89826c2 = x43.m89826c(this.f237031e, v6w0Var4, d850Var4, this);
                    yuk yukVar4 = yuk.f276404a;
                    if (objM89826c2 == yukVar4) {
                        return yukVar4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
        }
    }
}
