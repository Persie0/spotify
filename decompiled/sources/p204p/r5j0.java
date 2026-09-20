package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class r5j0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f196064a;

    /* JADX INFO: renamed from: b */
    public int f196065b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c3i0 f196066c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5j0(c3i0 c3i0Var, fbk fbkVar) {
        super(fbkVar);
        this.f196066c = c3i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f196064a = obj;
        this.f196065b |= Integer.MIN_VALUE;
        return this.f196066c.emit(null, this);
    }
}
