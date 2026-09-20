package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ptr0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f181244a;

    /* JADX INFO: renamed from: b */
    public int f181245b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ap0 f181246c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ptr0(ap0 ap0Var, fbk fbkVar) {
        super(fbkVar);
        this.f181246c = ap0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f181244a = obj;
        this.f181245b |= Integer.MIN_VALUE;
        return this.f181246c.emit(null, this);
    }
}
