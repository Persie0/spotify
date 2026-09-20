package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class s24 extends ibk {

    /* JADX INFO: renamed from: a */
    public long f204893a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f204894b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v24 f204895c;

    /* JADX INFO: renamed from: d */
    public int f204896d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s24(v24 v24Var, ibk ibkVar) {
        super(ibkVar);
        this.f204895c = v24Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f204894b = obj;
        this.f204896d |= Integer.MIN_VALUE;
        return this.f204895c.mo31336d(0L, null, this);
    }
}
