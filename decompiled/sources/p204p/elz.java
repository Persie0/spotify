package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class elz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60777a;

    /* JADX INFO: renamed from: b */
    public int f60778b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ flz f60779c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public elz(flz flzVar, fbk fbkVar) {
        super(fbkVar);
        this.f60779c = flzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f60777a = obj;
        this.f60778b |= Integer.MIN_VALUE;
        return this.f60779c.emit(null, this);
    }
}
