package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class oaa1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f163283a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ raa1 f163284b;

    /* JADX INFO: renamed from: c */
    public int f163285c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oaa1(raa1 raa1Var, ibk ibkVar) {
        super(ibkVar);
        this.f163284b = raa1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f163283a = obj;
        this.f163285c |= Integer.MIN_VALUE;
        return this.f163284b.m75104a(null, this);
    }
}
