package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ima extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f103650a;

    /* JADX INFO: renamed from: b */
    public int f103651b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s98 f103652c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ima(s98 s98Var, fbk fbkVar) {
        super(fbkVar);
        this.f103652c = s98Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f103650a = obj;
        this.f103651b |= Integer.MIN_VALUE;
        return this.f103652c.emit(null, this);
    }
}
