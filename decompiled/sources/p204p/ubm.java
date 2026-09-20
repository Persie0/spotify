package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ubm extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f228823a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wbm f228824b;

    /* JADX INFO: renamed from: c */
    public int f228825c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ubm(wbm wbmVar, ibk ibkVar) {
        super(ibkVar);
        this.f228824b = wbmVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f228823a = obj;
        this.f228825c |= Integer.MIN_VALUE;
        return this.f228824b.m87676c(null, null, null, this);
    }
}
