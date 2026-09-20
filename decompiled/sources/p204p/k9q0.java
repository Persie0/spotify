package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class k9q0 extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f120672a;

    /* JADX INFO: renamed from: b */
    public n0j f120673b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f120674c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ n9q0 f120675d;

    /* JADX INFO: renamed from: e */
    public int f120676e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9q0(n9q0 n9q0Var, ibk ibkVar) {
        super(ibkVar);
        this.f120675d = n9q0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f120674c = obj;
        this.f120676e |= Integer.MIN_VALUE;
        return this.f120675d.m63930f(false, this);
    }
}
