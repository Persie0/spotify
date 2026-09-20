package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class s131 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f204587a;

    /* JADX INFO: renamed from: b */
    public int f204588b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aq21 f204589c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s131(aq21 aq21Var, fbk fbkVar) {
        super(fbkVar);
        this.f204589c = aq21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f204587a = obj;
        this.f204588b |= Integer.MIN_VALUE;
        return this.f204589c.emit(null, this);
    }
}
