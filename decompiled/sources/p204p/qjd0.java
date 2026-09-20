package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qjd0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f189220a;

    /* JADX INFO: renamed from: b */
    public int f189221b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rjd0 f189222c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qjd0(rjd0 rjd0Var, ibk ibkVar) {
        super(ibkVar);
        this.f189222c = rjd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f189220a = obj;
        this.f189221b |= Integer.MIN_VALUE;
        return this.f189222c.mo15629a(null, null, this);
    }
}
