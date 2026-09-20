package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class vc5 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f240050a;

    /* JADX INFO: renamed from: b */
    public int f240051b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n03 f240052c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc5(n03 n03Var, fbk fbkVar) {
        super(fbkVar);
        this.f240052c = n03Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f240050a = obj;
        this.f240051b |= Integer.MIN_VALUE;
        return this.f240052c.emit(null, this);
    }
}
