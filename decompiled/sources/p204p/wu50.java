package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class wu50 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f255108a;

    /* JADX INFO: renamed from: b */
    public int f255109b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wk8 f255110c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu50(wk8 wk8Var, fbk fbkVar) {
        super(fbkVar);
        this.f255110c = wk8Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f255108a = obj;
        this.f255109b |= Integer.MIN_VALUE;
        return this.f255110c.emit(null, this);
    }
}
