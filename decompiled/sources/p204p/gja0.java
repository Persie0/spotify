package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gja0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f80420a;

    /* JADX INFO: renamed from: b */
    public int f80421b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hja0 f80422c;

    /* JADX INFO: renamed from: d */
    public bqz0 f80423d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gja0(hja0 hja0Var, ibk ibkVar) {
        super(ibkVar);
        this.f80422c = hja0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f80420a = obj;
        this.f80421b |= Integer.MIN_VALUE;
        return this.f80422c.mo15629a(null, null, this);
    }
}
