package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class imz0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f103794a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jmz0 f103795b;

    /* JADX INFO: renamed from: c */
    public int f103796c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imz0(jmz0 jmz0Var, ibk ibkVar) {
        super(ibkVar);
        this.f103795b = jmz0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f103794a = obj;
        this.f103796c |= Integer.MIN_VALUE;
        return jmz0.m53804l(this.f103795b, this);
    }
}
