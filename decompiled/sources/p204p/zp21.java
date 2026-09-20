package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zp21 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f284914a;

    /* JADX INFO: renamed from: b */
    public int f284915b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aq21 f284916c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp21(aq21 aq21Var, fbk fbkVar) {
        super(fbkVar);
        this.f284916c = aq21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f284914a = obj;
        this.f284915b |= Integer.MIN_VALUE;
        return this.f284916c.emit(null, this);
    }
}
