package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vdu extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f240488a;

    /* JADX INFO: renamed from: b */
    public int f240489b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ap0 f240490c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vdu(ap0 ap0Var, fbk fbkVar) {
        super(fbkVar);
        this.f240490c = ap0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f240488a = obj;
        this.f240489b |= Integer.MIN_VALUE;
        return this.f240490c.emit(null, this);
    }
}
