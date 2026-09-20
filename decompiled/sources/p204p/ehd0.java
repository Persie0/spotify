package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ehd0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f59545a;

    /* JADX INFO: renamed from: b */
    public int f59546b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fhd0 f59547c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehd0(fhd0 fhd0Var, fbk fbkVar) {
        super(fbkVar);
        this.f59547c = fhd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f59545a = obj;
        this.f59546b |= Integer.MIN_VALUE;
        return this.f59547c.emit(null, this);
    }
}
