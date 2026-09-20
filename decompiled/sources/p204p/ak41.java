package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ak41 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16434a;

    /* JADX INFO: renamed from: b */
    public int f16435b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b941 f16436c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak41(b941 b941Var, fbk fbkVar) {
        super(fbkVar);
        this.f16436c = b941Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f16434a = obj;
        this.f16435b |= Integer.MIN_VALUE;
        return this.f16436c.emit(null, this);
    }
}
