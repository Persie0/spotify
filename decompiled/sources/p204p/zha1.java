package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zha1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f282860a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ aia1 f282861b;

    /* JADX INFO: renamed from: c */
    public int f282862c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zha1(aia1 aia1Var, ibk ibkVar) {
        super(ibkVar);
        this.f282861b = aia1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f282860a = obj;
        this.f282862c |= Integer.MIN_VALUE;
        return this.f282861b.m26066a(this);
    }
}
