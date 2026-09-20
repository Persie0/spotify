package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class k181 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f118252a;

    /* JADX INFO: renamed from: b */
    public int f118253b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ud71 f118254c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k181(ud71 ud71Var, fbk fbkVar) {
        super(fbkVar);
        this.f118254c = ud71Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f118252a = obj;
        this.f118253b |= Integer.MIN_VALUE;
        return this.f118254c.emit(null, this);
    }
}
