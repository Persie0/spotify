package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class k9e1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f120575a;

    /* JADX INFO: renamed from: b */
    public int f120576b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ di91 f120577c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9e1(di91 di91Var, fbk fbkVar) {
        super(fbkVar);
        this.f120577c = di91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f120575a = obj;
        this.f120576b |= Integer.MIN_VALUE;
        return this.f120577c.emit(null, this);
    }
}
