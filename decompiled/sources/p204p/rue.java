package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class rue extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f202812a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dve f202813b;

    /* JADX INFO: renamed from: c */
    public int f202814c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rue(dve dveVar, ibk ibkVar) {
        super(ibkVar);
        this.f202813b = dveVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f202812a = obj;
        this.f202814c |= Integer.MIN_VALUE;
        return this.f202813b.m37093n(null, this);
    }
}
