package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ovn0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f170534a;

    /* JADX INFO: renamed from: b */
    public int f170535b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pvn0 f170536c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovn0(pvn0 pvn0Var, fbk fbkVar) {
        super(fbkVar);
        this.f170536c = pvn0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f170534a = obj;
        this.f170535b |= Integer.MIN_VALUE;
        return this.f170536c.emit(null, this);
    }
}
