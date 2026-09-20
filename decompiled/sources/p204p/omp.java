package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class omp extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f167070a;

    /* JADX INFO: renamed from: b */
    public int f167071b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gxo f167072c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public omp(gxo gxoVar, fbk fbkVar) {
        super(fbkVar);
        this.f167072c = gxoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f167070a = obj;
        this.f167071b |= Integer.MIN_VALUE;
        return this.f167072c.emit(null, this);
    }
}
