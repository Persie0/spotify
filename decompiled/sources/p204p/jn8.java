package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jn8 extends mb61 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f114039a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pm80 f114040b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jn8(pm80 pm80Var, fbk fbkVar, int i) {
        super(1, fbkVar);
        this.f114039a = i;
        this.f114040b = pm80Var;
    }

    @Override // p204p.ly8
    public final fbk create(fbk fbkVar) {
        switch (this.f114039a) {
            case 0:
                return new jn8(this.f114040b, fbkVar, 0);
            case 1:
                return new jn8(this.f114040b, fbkVar, 1);
            case 2:
                return new jn8(this.f114040b, fbkVar, 2);
            default:
                return new jn8(this.f114040b, fbkVar, 3);
        }
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        fbk fbkVar = (fbk) obj;
        switch (this.f114039a) {
            case 0:
                jn8 jn8Var = (jn8) create(fbkVar);
                bga.m29073P(w2a1.f247311a);
                return jn8Var.f114040b;
            case 1:
                jn8 jn8Var2 = (jn8) create(fbkVar);
                bga.m29073P(w2a1.f247311a);
                return jn8Var2.f114040b;
            case 2:
                jn8 jn8Var3 = (jn8) create(fbkVar);
                bga.m29073P(w2a1.f247311a);
                return jn8Var3.f114040b;
            default:
                jn8 jn8Var4 = (jn8) create(fbkVar);
                bga.m29073P(w2a1.f247311a);
                return jn8Var4.f114040b;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f114039a) {
            case 0:
                bga.m29073P(obj);
                break;
            case 1:
                bga.m29073P(obj);
                break;
            case 2:
                bga.m29073P(obj);
                break;
            default:
                bga.m29073P(obj);
                break;
        }
        return this.f114040b;
    }
}
