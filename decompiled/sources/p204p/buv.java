package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class buv extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f31222a;

    /* JADX INFO: renamed from: b */
    public int f31223b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ umv f31224c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public buv(umv umvVar, fbk fbkVar) {
        super(fbkVar);
        this.f31224c = umvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f31222a = obj;
        this.f31223b |= Integer.MIN_VALUE;
        return this.f31224c.emit(null, this);
    }
}
