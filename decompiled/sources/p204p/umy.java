package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class umy extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f231971a;

    /* JADX INFO: renamed from: b */
    public int f231972b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f231973c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f231974d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ cny f231975e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ umy(Object obj, fbk fbkVar, cny cnyVar, int i) {
        super(2, fbkVar);
        this.f231971a = i;
        this.f231974d = obj;
        this.f231975e = cnyVar;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f231971a) {
            case 0:
                umy umyVar = new umy(this.f231974d, fbkVar, this.f231975e, 0);
                umyVar.f231973c = obj;
                return umyVar;
            default:
                umy umyVar2 = new umy(this.f231974d, fbkVar, this.f231975e, 1);
                umyVar2.f231973c = obj;
                return umyVar2;
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        niz nizVar = (niz) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f231971a) {
            case 0:
                break;
        }
        return ((umy) create(nizVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f231971a) {
            case 0:
                int i = this.f231972b;
                if (i == 0) {
                    bga.m29073P(obj);
                    emy emyVar = (emy) this.f231974d;
                    chj0 chj0Var = this.f231975e.f40124b;
                    String str = emyVar.f61021a;
                    String str2 = emyVar.f61022b;
                    this.f231973c = null;
                    this.f231972b = 1;
                    Object objM32796d = chj0Var.m32796d(str, str2, this);
                    yuk yukVar = yuk.f276404a;
                    if (objM32796d == yukVar) {
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
                int i2 = this.f231972b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    niz nizVar = (niz) this.f231973c;
                    yly ylyVar = (yly) this.f231974d;
                    if (this.f231975e.f40126d.m88671a(ylyVar.f274119a)) {
                        ony onyVar = new ony(ylyVar.f274120b);
                        this.f231973c = null;
                        this.f231972b = 1;
                        Object objEmit = nizVar.emit(onyVar, this);
                        yuk yukVar2 = yuk.f276404a;
                        if (objEmit == yukVar2) {
                            return yukVar2;
                        }
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
