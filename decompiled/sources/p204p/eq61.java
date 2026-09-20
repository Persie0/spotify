package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class eq61 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f61796a;

    /* JADX INFO: renamed from: b */
    public int f61797b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b941 f61798c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq61(b941 b941Var, fbk fbkVar) {
        super(fbkVar);
        this.f61798c = b941Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f61796a = obj;
        this.f61797b |= Integer.MIN_VALUE;
        return this.f61798c.emit(null, this);
    }
}
