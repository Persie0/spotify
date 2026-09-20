package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jyh0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f117410a;

    /* JADX INFO: renamed from: b */
    public int f117411b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nif0 f117412c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyh0(nif0 nif0Var, fbk fbkVar) {
        super(fbkVar);
        this.f117412c = nif0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f117410a = obj;
        this.f117411b |= Integer.MIN_VALUE;
        return this.f117412c.emit(null, this);
    }
}
