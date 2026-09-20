package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class lm01 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f134733a;

    /* JADX INFO: renamed from: b */
    public int f134734b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ czz0 f134735c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm01(czz0 czz0Var, fbk fbkVar) {
        super(fbkVar);
        this.f134735c = czz0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f134733a = obj;
        this.f134734b |= Integer.MIN_VALUE;
        return this.f134735c.emit(null, this);
    }
}
