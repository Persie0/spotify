package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xli0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f263153a;

    /* JADX INFO: renamed from: b */
    public int f263154b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c3i0 f263155c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xli0(c3i0 c3i0Var, fbk fbkVar) {
        super(fbkVar);
        this.f263155c = c3i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f263153a = obj;
        this.f263154b |= Integer.MIN_VALUE;
        return this.f263155c.emit(null, this);
    }
}
