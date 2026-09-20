package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class uvj extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f234453a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f234454b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqi0 f234455c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uvj(boolean z, kqi0 kqi0Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f234453a = i;
        this.f234454b = z;
        this.f234455c = kqi0Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f234453a) {
            case 0:
                return new uvj(this.f234454b, this.f234455c, fbkVar, 0);
            case 1:
                return new uvj(this.f234454b, this.f234455c, fbkVar, 1);
            case 2:
                return new uvj(this.f234454b, this.f234455c, fbkVar, 2);
            case 3:
                return new uvj(this.f234454b, this.f234455c, fbkVar, 3);
            case 4:
                return new uvj(this.f234454b, this.f234455c, fbkVar, 4);
            case 5:
                return new uvj(this.f234454b, this.f234455c, fbkVar, 5);
            case 6:
                return new uvj(this.f234454b, this.f234455c, fbkVar, 6);
            default:
                return new uvj(this.f234454b, this.f234455c, fbkVar, 7);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f234453a) {
            case 0:
                uvj uvjVar = (uvj) create(xukVar, fbkVar);
                w2a1 w2a1Var = w2a1.f247311a;
                uvjVar.invokeSuspend(w2a1Var);
                return w2a1Var;
            case 1:
                uvj uvjVar2 = (uvj) create(xukVar, fbkVar);
                w2a1 w2a1Var2 = w2a1.f247311a;
                uvjVar2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
            case 2:
                uvj uvjVar3 = (uvj) create(xukVar, fbkVar);
                w2a1 w2a1Var3 = w2a1.f247311a;
                uvjVar3.invokeSuspend(w2a1Var3);
                return w2a1Var3;
            case 3:
                uvj uvjVar4 = (uvj) create(xukVar, fbkVar);
                w2a1 w2a1Var4 = w2a1.f247311a;
                uvjVar4.invokeSuspend(w2a1Var4);
                return w2a1Var4;
            case 4:
                uvj uvjVar5 = (uvj) create(xukVar, fbkVar);
                w2a1 w2a1Var5 = w2a1.f247311a;
                uvjVar5.invokeSuspend(w2a1Var5);
                return w2a1Var5;
            case 5:
                uvj uvjVar6 = (uvj) create(xukVar, fbkVar);
                w2a1 w2a1Var6 = w2a1.f247311a;
                uvjVar6.invokeSuspend(w2a1Var6);
                return w2a1Var6;
            case 6:
                uvj uvjVar7 = (uvj) create(xukVar, fbkVar);
                w2a1 w2a1Var7 = w2a1.f247311a;
                uvjVar7.invokeSuspend(w2a1Var7);
                return w2a1Var7;
            default:
                uvj uvjVar8 = (uvj) create(xukVar, fbkVar);
                w2a1 w2a1Var8 = w2a1.f247311a;
                uvjVar8.invokeSuspend(w2a1Var8);
                return w2a1Var8;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        int i = this.f234453a;
        w2a1 w2a1Var = w2a1.f247311a;
        kqi0 kqi0Var = this.f234455c;
        boolean z = this.f234454b;
        switch (i) {
            case 0:
                bga.m29073P(obj);
                if (z) {
                    kqi0Var.setValue(Boolean.TRUE);
                }
                break;
            case 1:
                bga.m29073P(obj);
                if (!z) {
                    kqi0Var.setValue(cey.m32597a((cey) kqi0Var.getValue(), false, false, 0.0f, 0.0f, 0, 0L, 60));
                }
                break;
            case 2:
                bga.m29073P(obj);
                float f = zz50.f287888a;
                kqi0Var.setValue(Boolean.valueOf(z));
                break;
            case 3:
                bga.m29073P(obj);
                kqi0Var.setValue(Boolean.valueOf(z));
                break;
            case 4:
                bga.m29073P(obj);
                kqi0Var.setValue(Boolean.valueOf(z));
                break;
            case 5:
                bga.m29073P(obj);
                if (z) {
                    kqi0Var.setValue(Boolean.TRUE);
                }
                break;
            case 6:
                bga.m29073P(obj);
                if (z) {
                    kqi0Var.setValue(Boolean.TRUE);
                }
                break;
            default:
                bga.m29073P(obj);
                if (!z) {
                    kqi0Var.setValue(Boolean.FALSE);
                }
                break;
        }
        return w2a1Var;
    }
}
