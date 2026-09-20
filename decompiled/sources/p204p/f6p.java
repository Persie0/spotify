package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class f6p extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f66452a;

    /* JADX INFO: renamed from: b */
    public int f66453b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gxo f66454c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6p(gxo gxoVar, fbk fbkVar) {
        super(fbkVar);
        this.f66454c = gxoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f66452a = obj;
        this.f66453b |= Integer.MIN_VALUE;
        return this.f66454c.emit(null, this);
    }
}
