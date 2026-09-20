package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class bjc1 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f27661a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f27662b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fjc1 f27663c;

    /* JADX INFO: renamed from: d */
    public int f27664d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bjc1(fjc1 fjc1Var, ibk ibkVar) {
        super(ibkVar);
        this.f27663c = fjc1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f27662b = obj;
        this.f27664d |= Integer.MIN_VALUE;
        return this.f27663c.m41800b(null, null, null, false, this);
    }
}
