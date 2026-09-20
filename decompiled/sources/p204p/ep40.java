package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ep40 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ float f61544a;

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        ep40 ep40Var = new ep40(2, fbkVar);
        ep40Var.f61544a = ((Number) obj).floatValue();
        return ep40Var;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        return ((ep40) create(Float.valueOf(((Number) obj).floatValue()), (fbk) obj2)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        bga.m29073P(obj);
        return Boolean.valueOf(this.f61544a > 0.0f);
    }
}
