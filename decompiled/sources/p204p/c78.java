package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class c78 extends mb61 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34788a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ String f34789b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c78(int i, int i2, fbk fbkVar) {
        super(i, fbkVar);
        this.f34788a = i2;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        switch (this.f34788a) {
            case 0:
                String str = (String) obj;
                new c78(3, 0, (fbk) obj3).f34789b = str;
                bga.m29073P(w2a1.f247311a);
                return str;
            default:
                String str2 = (String) obj2;
                new c78(3, 1, (fbk) obj3).f34789b = str2;
                bga.m29073P(w2a1.f247311a);
                return str2;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f34788a) {
            case 0:
                String str = this.f34789b;
                bga.m29073P(obj);
                return str;
            default:
                String str2 = this.f34789b;
                bga.m29073P(obj);
                return str2;
        }
    }
}
