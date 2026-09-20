package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class a5c0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f12486a;

    /* JADX INFO: renamed from: b */
    public int f12487b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b5c0 f12488c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5c0(b5c0 b5c0Var, ibk ibkVar) {
        super(ibkVar);
        this.f12488c = b5c0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f12486a = obj;
        this.f12487b |= Integer.MIN_VALUE;
        return this.f12488c.mo15629a(null, null, this);
    }
}
