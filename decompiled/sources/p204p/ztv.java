package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ztv extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f286270a;

    /* JADX INFO: renamed from: b */
    public int f286271b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sn2 f286272c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ztv(sn2 sn2Var, fbk fbkVar) {
        super(fbkVar);
        this.f286272c = sn2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f286270a = obj;
        this.f286271b |= Integer.MIN_VALUE;
        return this.f286272c.emit(null, this);
    }
}
