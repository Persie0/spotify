package p204p;

/* JADX INFO: renamed from: p.cq */
/* JADX INFO: loaded from: classes18.dex */
public final class C1750cq extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1786dq f40692a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1750cq(C1786dq c1786dq, fbk fbkVar) {
        super(2, fbkVar);
        this.f40692a = c1786dq;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        return new C1750cq(this.f40692a, fbkVar);
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        return ((C1750cq) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        bga.m29073P(obj);
        return this.f40692a.m36591b();
    }
}
