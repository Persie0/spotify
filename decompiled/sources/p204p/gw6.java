package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public final class gw6 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f84937a;

    /* JADX INFO: renamed from: b */
    public gh00 f84938b;

    /* JADX INFO: renamed from: c */
    public z0r f84939c;

    /* JADX INFO: renamed from: d */
    public int f84940d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ z0r f84941e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ gh00 f84942f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ kqi0 f84943g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gw6(z0r z0rVar, gh00 gh00Var, kqi0 kqi0Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f84937a = i;
        this.f84941e = z0rVar;
        this.f84942f = gh00Var;
        this.f84943g = kqi0Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f84937a) {
            case 0:
                return new gw6(this.f84941e, this.f84942f, this.f84943g, fbkVar, 0);
            default:
                return new gw6(this.f84941e, this.f84942f, this.f84943g, fbkVar, 1);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f84937a) {
            case 0:
                break;
        }
        return ((gw6) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        z0r z0rVar;
        gh00 gh00Var;
        Uri uri;
        gh00 gh00Var2;
        z0r z0rVar2;
        gh00 gh00Var3;
        Uri uri2;
        gh00 gh00Var4;
        switch (this.f84937a) {
            case 0:
                int i = this.f84940d;
                if (i == 0) {
                    bga.m29073P(obj);
                    z0rVar = this.f84941e;
                    if (z0rVar != null) {
                        gh00 gh00Var5 = (gh00) this.f84943g.getValue();
                        gh00Var = this.f84942f;
                        if (gh00Var5 != null) {
                            this.f84938b = gh00Var;
                            this.f84939c = z0rVar;
                            this.f84940d = 1;
                            obj = gh00Var5.invoke(this);
                            yuk yukVar = yuk.f276404a;
                            if (obj == yukVar) {
                                return yukVar;
                            }
                            gh00Var2 = gh00Var;
                        } else {
                            uri = null;
                        }
                        gh00Var.invoke(new xv6(uri, z0rVar));
                    }
                    return w2a1.f247311a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z0rVar = this.f84939c;
                gh00Var2 = this.f84938b;
                bga.m29073P(obj);
                uri = (Uri) obj;
                gh00Var = gh00Var2;
                gh00Var.invoke(new xv6(uri, z0rVar));
                return w2a1.f247311a;
            default:
                int i2 = this.f84940d;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    z0rVar2 = this.f84941e;
                    if (z0rVar2 != null) {
                        gh00 gh00Var6 = (gh00) this.f84943g.getValue();
                        gh00Var3 = this.f84942f;
                        if (gh00Var6 != null) {
                            this.f84938b = gh00Var3;
                            this.f84939c = z0rVar2;
                            this.f84940d = 1;
                            obj = gh00Var6.invoke(this);
                            yuk yukVar2 = yuk.f276404a;
                            if (obj == yukVar2) {
                                return yukVar2;
                            }
                            gh00Var4 = gh00Var3;
                        } else {
                            uri2 = null;
                        }
                        gh00Var3.invoke(new v371(uri2, z0rVar2));
                    }
                    return w2a1.f247311a;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z0rVar2 = this.f84939c;
                gh00Var4 = this.f84938b;
                bga.m29073P(obj);
                uri2 = (Uri) obj;
                gh00Var3 = gh00Var4;
                gh00Var3.invoke(new v371(uri2, z0rVar2));
                return w2a1.f247311a;
        }
    }
}
