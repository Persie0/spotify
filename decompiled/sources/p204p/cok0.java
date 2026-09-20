package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class cok0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f40287a;

    /* JADX INFO: renamed from: b */
    public int f40288b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w3k0 f40289c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cok0(w3k0 w3k0Var, fbk fbkVar) {
        super(fbkVar);
        this.f40289c = w3k0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f40287a = obj;
        this.f40288b |= Integer.MIN_VALUE;
        return this.f40289c.emit(null, this);
    }
}
