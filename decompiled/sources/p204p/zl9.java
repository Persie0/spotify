package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zl9 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f283948a;

    /* JADX INFO: renamed from: b */
    public int f283949b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s98 f283950c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl9(s98 s98Var, fbk fbkVar) {
        super(fbkVar);
        this.f283950c = s98Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f283948a = obj;
        this.f283949b |= Integer.MIN_VALUE;
        return this.f283950c.emit(null, this);
    }
}
