package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tbm extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f218903a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wbm f218904b;

    /* JADX INFO: renamed from: c */
    public int f218905c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tbm(wbm wbmVar, ibk ibkVar) {
        super(ibkVar);
        this.f218904b = wbmVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f218903a = obj;
        this.f218905c |= Integer.MIN_VALUE;
        return this.f218904b.m87675b(null, null, null, this);
    }
}
