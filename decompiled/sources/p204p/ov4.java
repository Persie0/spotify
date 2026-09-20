package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ov4 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f170415a;

    /* JADX INFO: renamed from: b */
    public int f170416b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n03 f170417c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov4(n03 n03Var, fbk fbkVar) {
        super(fbkVar);
        this.f170417c = n03Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f170415a = obj;
        this.f170416b |= Integer.MIN_VALUE;
        return this.f170417c.emit(null, this);
    }
}
