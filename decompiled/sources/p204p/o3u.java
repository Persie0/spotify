package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class o3u extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f161443a;

    /* JADX INFO: renamed from: b */
    public int f161444b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ p3u f161445c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3u(p3u p3uVar, ibk ibkVar) {
        super(ibkVar);
        this.f161445c = p3uVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f161443a = obj;
        this.f161444b |= Integer.MIN_VALUE;
        return this.f161445c.mo15629a(null, null, this);
    }
}
