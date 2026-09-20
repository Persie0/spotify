package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jzf0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f117721a;

    /* JADX INFO: renamed from: b */
    public int f117722b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nif0 f117723c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzf0(nif0 nif0Var, fbk fbkVar) {
        super(fbkVar);
        this.f117723c = nif0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f117721a = obj;
        this.f117722b |= Integer.MIN_VALUE;
        return this.f117723c.emit(null, this);
    }
}
