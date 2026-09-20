package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class k0b extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f117951a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ m0b f117952b;

    /* JADX INFO: renamed from: c */
    public int f117953c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0b(m0b m0bVar, ibk ibkVar) {
        super(ibkVar);
        this.f117952b = m0bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f117951a = obj;
        this.f117953c |= Integer.MIN_VALUE;
        return this.f117952b.m60456d(this);
    }
}
