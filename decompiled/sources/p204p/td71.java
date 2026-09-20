package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class td71 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f219256a;

    /* JADX INFO: renamed from: b */
    public int f219257b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ud71 f219258c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td71(ud71 ud71Var, fbk fbkVar) {
        super(fbkVar);
        this.f219258c = ud71Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f219256a = obj;
        this.f219257b |= Integer.MIN_VALUE;
        return this.f219258c.emit(null, this);
    }
}
