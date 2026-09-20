package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class q7p extends mb61 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f186155a;

    /* JADX INFO: renamed from: b */
    public int f186156b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ r7p f186157c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f186158d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f186159e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f186160f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q7p(r7p r7pVar, String str, String str2, String str3, fbk fbkVar, int i) {
        super(1, fbkVar);
        this.f186155a = i;
        this.f186157c = r7pVar;
        this.f186158d = str;
        this.f186159e = str2;
        this.f186160f = str3;
    }

    @Override // p204p.ly8
    public final fbk create(fbk fbkVar) {
        switch (this.f186155a) {
            case 0:
                return new q7p(this.f186157c, this.f186158d, this.f186159e, this.f186160f, fbkVar, 0);
            default:
                return new q7p(this.f186157c, this.f186158d, this.f186159e, this.f186160f, fbkVar, 1);
        }
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        fbk fbkVar = (fbk) obj;
        switch (this.f186155a) {
            case 0:
                break;
        }
        return ((q7p) create(fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f186155a) {
            case 0:
                int i = this.f186156b;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return obj;
                }
                bga.m29073P(obj);
                this.f186156b = 1;
                Object objM74952d = r7p.m74952d(this.f186157c, this.f186158d, this.f186159e, this.f186160f, this);
                yuk yukVar = yuk.f276404a;
                return objM74952d == yukVar ? yukVar : objM74952d;
            default:
                int i2 = this.f186156b;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return obj;
                }
                bga.m29073P(obj);
                this.f186156b = 1;
                Object objM74952d2 = r7p.m74952d(this.f186157c, this.f186158d, this.f186159e, this.f186160f, this);
                yuk yukVar2 = yuk.f276404a;
                return objM74952d2 == yukVar2 ? yukVar2 : objM74952d2;
        }
    }
}
