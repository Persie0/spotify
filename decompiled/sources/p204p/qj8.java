package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qj8 extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f189189a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f189190b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nt7 f189191c;

    /* JADX INFO: renamed from: d */
    public int f189192d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj8(nt7 nt7Var, ibk ibkVar) {
        super(ibkVar);
        this.f189191c = nt7Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f189190b = obj;
        this.f189192d |= Integer.MIN_VALUE;
        return this.f189191c.m65605g(false, this);
    }
}
