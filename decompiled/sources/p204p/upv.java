package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class upv extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f232831a;

    /* JADX INFO: renamed from: b */
    public int f232832b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ umv f232833c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public upv(umv umvVar, fbk fbkVar) {
        super(fbkVar);
        this.f232833c = umvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f232831a = obj;
        this.f232832b |= Integer.MIN_VALUE;
        return this.f232833c.emit(null, this);
    }
}
