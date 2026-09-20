package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class uoz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f232541a;

    /* JADX INFO: renamed from: b */
    public int f232542b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ flz f232543c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uoz(flz flzVar, fbk fbkVar) {
        super(fbkVar);
        this.f232543c = flzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f232541a = obj;
        this.f232542b |= Integer.MIN_VALUE;
        return this.f232543c.emit(null, this);
    }
}
