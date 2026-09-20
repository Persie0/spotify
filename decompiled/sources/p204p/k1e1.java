package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class k1e1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f118307a;

    /* JADX INFO: renamed from: b */
    public int f118308b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jpc1 f118309c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1e1(jpc1 jpc1Var, fbk fbkVar) {
        super(fbkVar);
        this.f118309c = jpc1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f118307a = obj;
        this.f118308b |= Integer.MIN_VALUE;
        return this.f118309c.emit(null, this);
    }
}
