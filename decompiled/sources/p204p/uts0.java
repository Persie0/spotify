package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class uts0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f233986a;

    /* JADX INFO: renamed from: b */
    public int f233987b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ z0s0 f233988c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uts0(z0s0 z0s0Var, fbk fbkVar) {
        super(fbkVar);
        this.f233988c = z0s0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f233986a = obj;
        this.f233987b |= Integer.MIN_VALUE;
        return this.f233988c.emit(null, this);
    }
}
