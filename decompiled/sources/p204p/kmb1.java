package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class kmb1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f124103a;

    /* JADX INFO: renamed from: b */
    public int f124104b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fmb1 f124105c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmb1(fmb1 fmb1Var, fbk fbkVar) {
        super(fbkVar);
        this.f124105c = fmb1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f124103a = obj;
        this.f124104b |= Integer.MIN_VALUE;
        return this.f124105c.emit(null, this);
    }
}
