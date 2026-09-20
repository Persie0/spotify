package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fvz0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f73906a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f73907b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jz90 f73908c;

    /* JADX INFO: renamed from: d */
    public int f73909d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fvz0(jz90 jz90Var, ibk ibkVar) {
        super(ibkVar);
        this.f73908c = jz90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f73907b = obj;
        this.f73909d |= Integer.MIN_VALUE;
        return this.f73908c.m54854b(null, this);
    }
}
