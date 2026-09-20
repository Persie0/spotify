package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class sp61 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f212751a;

    /* JADX INFO: renamed from: b */
    public int f212752b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b941 f212753c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp61(b941 b941Var, fbk fbkVar) {
        super(fbkVar);
        this.f212753c = b941Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f212751a = obj;
        this.f212752b |= Integer.MIN_VALUE;
        return this.f212753c.emit(null, this);
    }
}
