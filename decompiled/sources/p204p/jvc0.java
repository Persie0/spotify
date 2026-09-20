package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jvc0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f116300a;

    /* JADX INFO: renamed from: b */
    public int f116301b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kvc0 f116302c;

    /* JADX INFO: renamed from: d */
    public bqz0 f116303d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvc0(kvc0 kvc0Var, ibk ibkVar) {
        super(ibkVar);
        this.f116302c = kvc0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f116300a = obj;
        this.f116301b |= Integer.MIN_VALUE;
        return this.f116302c.mo15629a(null, null, this);
    }
}
