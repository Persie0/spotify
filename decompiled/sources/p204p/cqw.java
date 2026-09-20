package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class cqw extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f41014a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ d9p f41015b;

    /* JADX INFO: renamed from: c */
    public int f41016c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqw(d9p d9pVar, ibk ibkVar) {
        super(ibkVar);
        this.f41015b = d9pVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f41014a = obj;
        this.f41016c |= Integer.MIN_VALUE;
        return this.f41015b.mo35384e(0, this);
    }
}
