package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ani0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17447a;

    /* JADX INFO: renamed from: b */
    public int f17448b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c3i0 f17449c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ani0(c3i0 c3i0Var, fbk fbkVar) {
        super(fbkVar);
        this.f17449c = c3i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f17447a = obj;
        this.f17448b |= Integer.MIN_VALUE;
        return this.f17449c.emit(null, this);
    }
}
