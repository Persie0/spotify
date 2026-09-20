package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class moz0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f145799a;

    /* JADX INFO: renamed from: b */
    public int f145800b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ady0 f145801c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public moz0(ady0 ady0Var, fbk fbkVar) {
        super(fbkVar);
        this.f145801c = ady0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f145799a = obj;
        this.f145800b |= Integer.MIN_VALUE;
        return this.f145801c.emit(null, this);
    }
}
