package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class y1k extends mb61 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f268279a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f268280b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y1k(String str, fbk fbkVar, int i) {
        super(1, fbkVar);
        this.f268279a = i;
        this.f268280b = str;
    }

    @Override // p204p.ly8
    public final fbk create(fbk fbkVar) {
        switch (this.f268279a) {
            case 0:
                return new y1k(this.f268280b, fbkVar, 0);
            case 1:
                return new y1k(this.f268280b, fbkVar, 1);
            case 2:
                return new y1k(this.f268280b, fbkVar, 2);
            case 3:
                return new y1k(this.f268280b, fbkVar, 3);
            default:
                return new y1k(this.f268280b, fbkVar, 4);
        }
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        fbk fbkVar = (fbk) obj;
        switch (this.f268279a) {
            case 0:
                y1k y1kVar = (y1k) create(fbkVar);
                bga.m29073P(w2a1.f247311a);
                return y1kVar.f268280b;
            case 1:
                y1k y1kVar2 = (y1k) create(fbkVar);
                bga.m29073P(w2a1.f247311a);
                return y1kVar2.f268280b;
            case 2:
                y1k y1kVar3 = (y1k) create(fbkVar);
                bga.m29073P(w2a1.f247311a);
                return y1kVar3.f268280b;
            case 3:
                y1k y1kVar4 = (y1k) create(fbkVar);
                bga.m29073P(w2a1.f247311a);
                return y1kVar4.f268280b;
            default:
                y1k y1kVar5 = (y1k) create(fbkVar);
                bga.m29073P(w2a1.f247311a);
                return y1kVar5.f268280b;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f268279a) {
            case 0:
                bga.m29073P(obj);
                break;
            case 1:
                bga.m29073P(obj);
                break;
            case 2:
                bga.m29073P(obj);
                break;
            case 3:
                bga.m29073P(obj);
                break;
            default:
                bga.m29073P(obj);
                break;
        }
        return this.f268280b;
    }
}
