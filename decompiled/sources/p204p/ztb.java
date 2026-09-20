package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ztb extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f286126a;

    /* JADX INFO: renamed from: b */
    public int f286127b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lu5 f286128c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ztb(lu5 lu5Var, fbk fbkVar) {
        super(fbkVar);
        this.f286128c = lu5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f286126a = obj;
        this.f286127b |= Integer.MIN_VALUE;
        return this.f286128c.emit(null, this);
    }
}
