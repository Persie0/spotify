package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zmq extends mb61 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f284327a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ z601 f284328b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zmq(int i, int i2, fbk fbkVar) {
        super(i, fbkVar);
        this.f284327a = i2;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        z601 z601Var = (z601) obj;
        fbk fbkVar = (fbk) obj3;
        switch (this.f284327a) {
            case 0:
                zmq zmqVar = new zmq(3, 0, fbkVar);
                zmqVar.f284328b = z601Var;
                w2a1 w2a1Var = w2a1.f247311a;
                zmqVar.invokeSuspend(w2a1Var);
                return w2a1Var;
            default:
                zmq zmqVar2 = new zmq(3, 1, fbkVar);
                zmqVar2.f284328b = z601Var;
                w2a1 w2a1Var2 = w2a1.f247311a;
                zmqVar2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f284327a) {
            case 0:
                z601 z601Var = this.f284328b;
                bga.m29073P(obj);
                z601.m95468a(z601Var, "deleteCache", null, false, 6);
                break;
            default:
                z601 z601Var2 = this.f284328b;
                bga.m29073P(obj);
                z601.m95468a(z601Var2, "removeDownloads", null, false, 6);
                break;
        }
        return w2a1.f247311a;
    }
}
