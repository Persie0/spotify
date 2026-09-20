package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class qd0 extends ibk {

    /* JADX INFO: renamed from: a */
    public sr4 f187434a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f187435b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ td0 f187436c;

    /* JADX INFO: renamed from: d */
    public int f187437d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd0(td0 td0Var, ibk ibkVar) {
        super(ibkVar);
        this.f187436c = td0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f187435b = obj;
        this.f187437d |= Integer.MIN_VALUE;
        return td0.m80483b(this.f187436c, null, null, this);
    }
}
