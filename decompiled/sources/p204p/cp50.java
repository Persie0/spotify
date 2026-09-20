package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cp50 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f40462a;

    /* JADX INFO: renamed from: b */
    public int f40463b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wc30 f40464c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp50(wc30 wc30Var, fbk fbkVar) {
        super(fbkVar);
        this.f40464c = wc30Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f40462a = obj;
        this.f40463b |= Integer.MIN_VALUE;
        return this.f40464c.emit(null, this);
    }
}
