package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class nt01 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f157946a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f157947b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ot01 f157948c;

    /* JADX INFO: renamed from: d */
    public int f157949d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt01(ot01 ot01Var, ibk ibkVar) {
        super(ibkVar);
        this.f157948c = ot01Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f157947b = obj;
        this.f157949d |= Integer.MIN_VALUE;
        return this.f157948c.m67759g(null, this);
    }
}
