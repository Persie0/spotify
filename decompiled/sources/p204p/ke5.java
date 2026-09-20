package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ke5 extends ibk {

    /* JADX INFO: renamed from: a */
    public int f121805a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f121806b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ le5 f121807c;

    /* JADX INFO: renamed from: d */
    public int f121808d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke5(le5 le5Var, ibk ibkVar) {
        super(ibkVar);
        this.f121807c = le5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f121806b = obj;
        this.f121808d |= Integer.MIN_VALUE;
        return this.f121807c.m58775b(null, this);
    }
}
