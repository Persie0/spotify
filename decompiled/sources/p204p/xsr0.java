package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xsr0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f265653a;

    /* JADX INFO: renamed from: b */
    public int f265654b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dar0 f265655c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsr0(dar0 dar0Var, fbk fbkVar) {
        super(fbkVar);
        this.f265655c = dar0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f265653a = obj;
        this.f265654b |= Integer.MIN_VALUE;
        return this.f265655c.emit(null, this);
    }
}
