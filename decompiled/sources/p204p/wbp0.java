package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class wbp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f249836a;

    /* JADX INFO: renamed from: b */
    public int f249837b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pvn0 f249838c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wbp0(pvn0 pvn0Var, fbk fbkVar) {
        super(fbkVar);
        this.f249838c = pvn0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f249836a = obj;
        this.f249837b |= Integer.MIN_VALUE;
        return this.f249838c.emit(null, this);
    }
}
