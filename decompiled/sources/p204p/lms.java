package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class lms extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f135012a;

    /* JADX INFO: renamed from: b */
    public int f135013b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hhq f135014c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lms(hhq hhqVar, fbk fbkVar) {
        super(fbkVar);
        this.f135014c = hhqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f135012a = obj;
        this.f135013b |= Integer.MIN_VALUE;
        return this.f135014c.emit(null, this);
    }
}
