package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class d841 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f46364a;

    /* JADX INFO: renamed from: b */
    public int f46365b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aq21 f46366c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d841(aq21 aq21Var, fbk fbkVar) {
        super(fbkVar);
        this.f46366c = aq21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f46364a = obj;
        this.f46365b |= Integer.MIN_VALUE;
        return this.f46366c.emit(null, this);
    }
}
