package p204p;

import com.spotify.address.endpoint.model.p012v1.proto.GetFormRequest;

/* JADX INFO: loaded from: classes5.dex */
public final class cqh0 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40890a;

    /* JADX INFO: renamed from: b */
    public int f40891b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lw1 f40892c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cqh0(lw1 lw1Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f40890a = i;
        this.f40892c = lw1Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f40890a) {
            case 0:
                return new cqh0(this.f40892c, fbkVar, 0);
            case 1:
                return new cqh0(this.f40892c, fbkVar, 1);
            default:
                return new cqh0(this.f40892c, fbkVar, 2);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f40890a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((cqh0) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f40890a) {
            case 0:
                int i = this.f40891b;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return obj;
                }
                bga.m29073P(obj);
                GetFormRequest getFormRequestM2437o = GetFormRequest.m2437o();
                this.f40891b = 1;
                Object objMo60087a = this.f40892c.mo60087a(getFormRequestM2437o, this);
                yuk yukVar = yuk.f276404a;
                return objMo60087a == yukVar ? yukVar : objMo60087a;
            case 1:
                int i2 = this.f40891b;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return obj;
                }
                bga.m29073P(obj);
                GetFormRequest getFormRequestM2437o2 = GetFormRequest.m2437o();
                this.f40891b = 1;
                Object objMo60087a2 = this.f40892c.mo60087a(getFormRequestM2437o2, this);
                yuk yukVar2 = yuk.f276404a;
                return objMo60087a2 == yukVar2 ? yukVar2 : objMo60087a2;
            default:
                int i3 = this.f40891b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return obj;
                }
                bga.m29073P(obj);
                GetFormRequest getFormRequestM2437o3 = GetFormRequest.m2437o();
                this.f40891b = 1;
                Object objMo60087a3 = this.f40892c.mo60087a(getFormRequestM2437o3, this);
                yuk yukVar3 = yuk.f276404a;
                return objMo60087a3 == yukVar3 ? yukVar3 : objMo60087a3;
        }
    }
}
