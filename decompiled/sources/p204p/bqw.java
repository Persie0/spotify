package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class bqw extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f29896a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ d9p f29897b;

    /* JADX INFO: renamed from: c */
    public int f29898c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqw(d9p d9pVar, ibk ibkVar) {
        super(ibkVar);
        this.f29897b = d9pVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f29896a = obj;
        this.f29898c |= Integer.MIN_VALUE;
        return this.f29897b.mo35381b(null, this);
    }
}
