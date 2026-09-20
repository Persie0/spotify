package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class k0f extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f118071a;

    /* JADX INFO: renamed from: b */
    public int f118072b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ede f118073c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0f(ede edeVar, fbk fbkVar) {
        super(fbkVar);
        this.f118073c = edeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f118071a = obj;
        this.f118072b |= Integer.MIN_VALUE;
        return this.f118073c.emit(null, this);
    }
}
