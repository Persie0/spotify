package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mcx extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f142259a;

    /* JADX INFO: renamed from: b */
    public int f142260b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ umv f142261c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mcx(umv umvVar, fbk fbkVar) {
        super(fbkVar);
        this.f142261c = umvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f142259a = obj;
        this.f142260b |= Integer.MIN_VALUE;
        return this.f142261c.emit(null, this);
    }
}
