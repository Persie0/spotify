package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class b691 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f23885a;

    /* JADX INFO: renamed from: b */
    public int f23886b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ud71 f23887c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b691(ud71 ud71Var, fbk fbkVar) {
        super(fbkVar);
        this.f23887c = ud71Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f23885a = obj;
        this.f23886b |= Integer.MIN_VALUE;
        return this.f23887c.emit(null, this);
    }
}
