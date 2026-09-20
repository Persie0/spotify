package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class wvd extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f255471a = 1;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f255472b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqi0 f255473c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wvd(Object obj, kqi0 kqi0Var, fbk fbkVar) {
        super(2, fbkVar);
        this.f255472b = obj;
        this.f255473c = kqi0Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f255471a) {
            case 0:
                wvd wvdVar = new wvd(this.f255473c, fbkVar);
                wvdVar.f255472b = obj;
                return wvdVar;
            default:
                return new wvd(this.f255472b, this.f255473c, fbkVar);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f255471a) {
            case 0:
                wvd wvdVar = (wvd) create((String) obj, (fbk) obj2);
                w2a1 w2a1Var = w2a1.f247311a;
                wvdVar.invokeSuspend(w2a1Var);
                return w2a1Var;
            default:
                wvd wvdVar2 = (wvd) create((xuk) obj, (fbk) obj2);
                w2a1 w2a1Var2 = w2a1.f247311a;
                wvdVar2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f255471a) {
            case 0:
                String str = (String) this.f255472b;
                bga.m29073P(obj);
                ((gh00) this.f255473c.getValue()).invoke(str);
                break;
            default:
                bga.m29073P(obj);
                this.f255473c.setValue(this.f255472b);
                break;
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wvd(kqi0 kqi0Var, fbk fbkVar) {
        super(2, fbkVar);
        this.f255473c = kqi0Var;
    }
}
