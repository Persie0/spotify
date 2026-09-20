package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hte1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f95001a;

    /* JADX INFO: renamed from: b */
    public int f95002b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ di91 f95003c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hte1(di91 di91Var, fbk fbkVar) {
        super(fbkVar);
        this.f95003c = di91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f95001a = obj;
        this.f95002b |= Integer.MIN_VALUE;
        return this.f95003c.emit(null, this);
    }
}
