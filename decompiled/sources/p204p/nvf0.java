package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class nvf0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f158884a;

    /* JADX INFO: renamed from: b */
    public int f158885b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nif0 f158886c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nvf0(nif0 nif0Var, fbk fbkVar) {
        super(fbkVar);
        this.f158886c = nif0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f158884a = obj;
        this.f158885b |= Integer.MIN_VALUE;
        return this.f158886c.emit(null, this);
    }
}
