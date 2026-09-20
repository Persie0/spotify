package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bgm0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f26969a;

    /* JADX INFO: renamed from: b */
    public int f26970b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cgm0 f26971c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgm0(cgm0 cgm0Var, fbk fbkVar) {
        super(fbkVar);
        this.f26971c = cgm0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f26969a = obj;
        this.f26970b |= Integer.MIN_VALUE;
        return this.f26971c.emit(null, this);
    }
}
