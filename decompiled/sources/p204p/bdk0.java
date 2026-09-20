package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class bdk0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f26125a;

    /* JADX INFO: renamed from: b */
    public int f26126b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w3k0 f26127c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdk0(w3k0 w3k0Var, fbk fbkVar) {
        super(fbkVar);
        this.f26127c = w3k0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f26125a = obj;
        this.f26126b |= Integer.MIN_VALUE;
        return this.f26127c.emit(null, this);
    }
}
