package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class hez0 extends ibk {

    /* JADX INFO: renamed from: a */
    public Object f90560a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f90561b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jez0 f90562c;

    /* JADX INFO: renamed from: d */
    public int f90563d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hez0(jez0 jez0Var, ibk ibkVar) {
        super(ibkVar);
        this.f90562c = jez0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f90561b = obj;
        this.f90563d |= Integer.MIN_VALUE;
        return jez0.m53135H1(this.f90562c, this);
    }
}
