package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bpe extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f29419a;

    /* JADX INFO: renamed from: b */
    public int f29420b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cpe f29421c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpe(cpe cpeVar, ibk ibkVar) {
        super(ibkVar);
        this.f29421c = cpeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f29419a = obj;
        this.f29420b |= Integer.MIN_VALUE;
        return this.f29421c.mo15629a(null, null, this);
    }
}
