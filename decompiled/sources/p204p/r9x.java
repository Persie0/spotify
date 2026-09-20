package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class r9x extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f197132a;

    /* JADX INFO: renamed from: b */
    public int f197133b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ umv f197134c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9x(umv umvVar, fbk fbkVar) {
        super(fbkVar);
        this.f197134c = umvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f197132a = obj;
        this.f197133b |= Integer.MIN_VALUE;
        return this.f197134c.emit(null, this);
    }
}
