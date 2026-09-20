package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class b191 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f22267a;

    /* JADX INFO: renamed from: b */
    public int f22268b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ud71 f22269c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b191(ud71 ud71Var, fbk fbkVar) {
        super(fbkVar);
        this.f22269c = ud71Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f22267a = obj;
        this.f22268b |= Integer.MIN_VALUE;
        return this.f22269c.emit(null, this);
    }
}
