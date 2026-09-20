package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class bck0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f25907a;

    /* JADX INFO: renamed from: b */
    public int f25908b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w3k0 f25909c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bck0(w3k0 w3k0Var, fbk fbkVar) {
        super(fbkVar);
        this.f25909c = w3k0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f25907a = obj;
        this.f25908b |= Integer.MIN_VALUE;
        return this.f25909c.emit(null, this);
    }
}
