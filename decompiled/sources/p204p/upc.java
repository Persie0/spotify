package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class upc extends mb61 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f232626a;

    /* JADX INFO: renamed from: b */
    public int f232627b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ grc f232628c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ qpc f232629d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boc f232630e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ upc(grc grcVar, qpc qpcVar, boc bocVar, fbk fbkVar, int i) {
        super(1, fbkVar);
        this.f232626a = i;
        this.f232628c = grcVar;
        this.f232629d = qpcVar;
        this.f232630e = bocVar;
    }

    @Override // p204p.ly8
    public final fbk create(fbk fbkVar) {
        switch (this.f232626a) {
            case 0:
                return new upc(this.f232628c, this.f232629d, this.f232630e, fbkVar, 0);
            default:
                return new upc(this.f232628c, this.f232629d, this.f232630e, fbkVar, 1);
        }
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        fbk fbkVar = (fbk) obj;
        switch (this.f232626a) {
            case 0:
                break;
        }
        return ((upc) create(fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f232626a) {
            case 0:
                int i = this.f232627b;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return obj;
                }
                bga.m29073P(obj);
                String str = this.f232630e.f29065a;
                this.f232627b = 1;
                Object objM55210l = k2z0.m55210l(this.f232628c, this.f232629d, str, this);
                yuk yukVar = yuk.f276404a;
                return objM55210l == yukVar ? yukVar : objM55210l;
            default:
                int i2 = this.f232627b;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return obj;
                }
                bga.m29073P(obj);
                String str2 = this.f232630e.f29065a;
                this.f232627b = 1;
                Object objM55209k = k2z0.m55209k(this.f232628c, this.f232629d, str2, this);
                yuk yukVar2 = yuk.f276404a;
                return objM55209k == yukVar2 ? yukVar2 : objM55209k;
        }
    }
}
