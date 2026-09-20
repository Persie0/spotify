package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class esi0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f62412a;

    /* JADX INFO: renamed from: b */
    public int f62413b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ap0 f62414c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public esi0(ap0 ap0Var, fbk fbkVar) {
        super(fbkVar);
        this.f62414c = ap0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f62412a = obj;
        this.f62413b |= Integer.MIN_VALUE;
        return this.f62414c.emit(null, this);
    }
}
