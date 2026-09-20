package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class uuj extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f234208a;

    /* JADX INFO: renamed from: b */
    public int f234209b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vuj f234210c;

    /* JADX INFO: renamed from: d */
    public bqz0 f234211d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uuj(vuj vujVar, ibk ibkVar) {
        super(ibkVar);
        this.f234210c = vujVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f234208a = obj;
        this.f234209b |= Integer.MIN_VALUE;
        return this.f234210c.mo15629a(null, null, this);
    }
}
