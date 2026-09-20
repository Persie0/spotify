package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class lml0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f134987a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uml0 f134988b;

    /* JADX INFO: renamed from: c */
    public int f134989c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lml0(uml0 uml0Var, ibk ibkVar) {
        super(ibkVar);
        this.f134988b = uml0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f134987a = obj;
        this.f134989c |= Integer.MIN_VALUE;
        return this.f134988b.m83455b(this);
    }
}
