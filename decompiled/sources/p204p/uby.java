package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class uby extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f228902a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zby f228903b;

    /* JADX INFO: renamed from: c */
    public int f228904c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uby(zby zbyVar, ibk ibkVar) {
        super(ibkVar);
        this.f228903b = zbyVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f228902a = obj;
        this.f228904c |= Integer.MIN_VALUE;
        return this.f228903b.m95889g(null, this);
    }
}
