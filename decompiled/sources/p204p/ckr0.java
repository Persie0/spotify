package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ckr0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f39076a;

    /* JADX INFO: renamed from: b */
    public int f39077b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wk8 f39078c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckr0(wk8 wk8Var, fbk fbkVar) {
        super(fbkVar);
        this.f39078c = wk8Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f39076a = obj;
        this.f39077b |= Integer.MIN_VALUE;
        return this.f39078c.emit(null, this);
    }
}
