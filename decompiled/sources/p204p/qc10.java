package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qc10 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f187233a;

    /* JADX INFO: renamed from: b */
    public int f187234b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ flz f187235c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc10(flz flzVar, fbk fbkVar) {
        super(fbkVar);
        this.f187235c = flzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f187233a = obj;
        this.f187234b |= Integer.MIN_VALUE;
        return this.f187235c.emit(null, this);
    }
}
