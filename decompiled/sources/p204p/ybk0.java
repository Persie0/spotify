package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ybk0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f271206a;

    /* JADX INFO: renamed from: b */
    public int f271207b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zbk0 f271208c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybk0(zbk0 zbk0Var, ibk ibkVar) {
        super(ibkVar);
        this.f271208c = zbk0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f271206a = obj;
        this.f271207b |= Integer.MIN_VALUE;
        return this.f271208c.mo15629a(null, null, this);
    }
}
