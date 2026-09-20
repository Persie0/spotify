package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class cka extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f38902a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hka f38903b;

    /* JADX INFO: renamed from: c */
    public int f38904c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cka(hka hkaVar, ibk ibkVar) {
        super(ibkVar);
        this.f38903b = hkaVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f38902a = obj;
        this.f38904c |= Integer.MIN_VALUE;
        return this.f38903b.m47751p(null, null, this);
    }
}
