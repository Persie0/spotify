package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mk40 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f144488a;

    /* JADX INFO: renamed from: b */
    public int f144489b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wc30 f144490c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk40(wc30 wc30Var, fbk fbkVar) {
        super(fbkVar);
        this.f144490c = wc30Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f144488a = obj;
        this.f144489b |= Integer.MIN_VALUE;
        return this.f144490c.emit(null, this);
    }
}
