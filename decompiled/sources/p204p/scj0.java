package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class scj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f207755a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f207756b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ tcj0 f207757c;

    /* JADX INFO: renamed from: d */
    public int f207758d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public scj0(tcj0 tcj0Var, ibk ibkVar) {
        super(ibkVar);
        this.f207757c = tcj0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f207756b = obj;
        this.f207758d |= Integer.MIN_VALUE;
        return tcj0.m80476c(this.f207757c, false, this);
    }
}
