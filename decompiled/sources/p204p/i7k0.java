package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class i7k0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f99573a;

    /* JADX INFO: renamed from: b */
    public int f99574b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w3k0 f99575c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7k0(w3k0 w3k0Var, fbk fbkVar) {
        super(fbkVar);
        this.f99575c = w3k0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f99573a = obj;
        this.f99574b |= Integer.MIN_VALUE;
        return this.f99575c.emit(null, this);
    }
}
