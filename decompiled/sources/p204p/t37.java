package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class t37 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ long f216713a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f216714b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t37(long j, fbk fbkVar) {
        super(2, fbkVar);
        this.f216714b = j;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        t37 t37Var = new t37(this.f216714b, fbkVar);
        t37Var.f216713a = ((Number) obj).longValue();
        return t37Var;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        return ((t37) create(Long.valueOf(((Number) obj).longValue()), (fbk) obj2)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        long j = this.f216713a;
        bga.m29073P(obj);
        return Boolean.valueOf(j >= this.f216714b);
    }
}
