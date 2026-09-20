package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class x9q0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f259423a;

    /* JADX INFO: renamed from: b */
    public int f259424b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ndp0 f259425c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9q0(ndp0 ndp0Var, fbk fbkVar) {
        super(fbkVar);
        this.f259425c = ndp0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f259423a = obj;
        this.f259424b |= Integer.MIN_VALUE;
        return this.f259425c.emit(null, this);
    }
}
