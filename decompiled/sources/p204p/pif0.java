package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class pif0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f177932a;

    /* JADX INFO: renamed from: b */
    public int f177933b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nif0 f177934c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pif0(nif0 nif0Var, fbk fbkVar) {
        super(fbkVar);
        this.f177934c = nif0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f177932a = obj;
        this.f177933b |= Integer.MIN_VALUE;
        return this.f177934c.emit(null, this);
    }
}
