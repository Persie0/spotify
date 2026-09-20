package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class vc90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f240089a;

    /* JADX INFO: renamed from: b */
    public int f240090b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qb90 f240091c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc90(qb90 qb90Var, fbk fbkVar) {
        super(fbkVar);
        this.f240091c = qb90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f240089a = obj;
        this.f240090b |= Integer.MIN_VALUE;
        return this.f240091c.emit(null, this);
    }
}
