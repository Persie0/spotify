package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mf90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f143000a;

    /* JADX INFO: renamed from: b */
    public int f143001b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qb90 f143002c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf90(qb90 qb90Var, fbk fbkVar) {
        super(fbkVar);
        this.f143002c = qb90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f143000a = obj;
        this.f143001b |= Integer.MIN_VALUE;
        return this.f143002c.emit(null, this);
    }
}
