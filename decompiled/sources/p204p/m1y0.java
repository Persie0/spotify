package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class m1y0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f139163a;

    /* JADX INFO: renamed from: b */
    public int f139164b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ k1y0 f139165c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1y0(k1y0 k1y0Var, fbk fbkVar) {
        super(fbkVar);
        this.f139165c = k1y0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f139163a = obj;
        this.f139164b |= Integer.MIN_VALUE;
        return this.f139165c.emit(null, this);
    }
}
