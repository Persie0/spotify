package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class yh41 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f272726a;

    /* JADX INFO: renamed from: b */
    public z650 f272727b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f272728c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zh41 f272729d;

    /* JADX INFO: renamed from: e */
    public int f272730e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh41(zh41 zh41Var, ibk ibkVar) {
        super(ibkVar);
        this.f272729d = zh41Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f272728c = obj;
        this.f272730e |= Integer.MIN_VALUE;
        return this.f272729d.m96114c(null, null, null, this);
    }
}
