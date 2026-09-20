package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class asn0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f19473a;

    /* JADX INFO: renamed from: b */
    public int f19474b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cgm0 f19475c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asn0(cgm0 cgm0Var, fbk fbkVar) {
        super(fbkVar);
        this.f19475c = cgm0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f19473a = obj;
        this.f19474b |= Integer.MIN_VALUE;
        return this.f19475c.emit(null, this);
    }
}
