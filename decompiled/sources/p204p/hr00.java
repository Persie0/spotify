package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hr00 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f94278a;

    /* JADX INFO: renamed from: b */
    public int f94279b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ flz f94280c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hr00(flz flzVar, fbk fbkVar) {
        super(fbkVar);
        this.f94280c = flzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f94278a = obj;
        this.f94279b |= Integer.MIN_VALUE;
        return this.f94280c.emit(null, this);
    }
}
