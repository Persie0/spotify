package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class jqb extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f114868a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ap0 f114869b;

    /* JADX INFO: renamed from: c */
    public int f114870c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqb(ap0 ap0Var, fbk fbkVar) {
        super(fbkVar);
        this.f114869b = ap0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f114868a = obj;
        this.f114870c |= Integer.MIN_VALUE;
        return this.f114869b.emit(null, this);
    }
}
