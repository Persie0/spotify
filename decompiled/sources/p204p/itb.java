package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class itb extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f105495a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jtb f105496b;

    /* JADX INFO: renamed from: c */
    public int f105497c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public itb(jtb jtbVar, ibk ibkVar) {
        super(ibkVar);
        this.f105496b = jtbVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f105495a = obj;
        this.f105497c |= Integer.MIN_VALUE;
        return this.f105496b.m54281b(null, this);
    }
}
