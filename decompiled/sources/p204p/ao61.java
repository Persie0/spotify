package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ao61 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17586a;

    /* JADX INFO: renamed from: b */
    public int f17587b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b941 f17588c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao61(b941 b941Var, fbk fbkVar) {
        super(fbkVar);
        this.f17588c = b941Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f17586a = obj;
        this.f17587b |= Integer.MIN_VALUE;
        return this.f17588c.emit(null, this);
    }
}
