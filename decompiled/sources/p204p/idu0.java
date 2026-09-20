package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class idu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f101245a;

    /* JADX INFO: renamed from: b */
    public int f101246b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jcu0 f101247c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public idu0(jcu0 jcu0Var, fbk fbkVar) {
        super(fbkVar);
        this.f101247c = jcu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f101245a = obj;
        this.f101246b |= Integer.MIN_VALUE;
        return this.f101247c.emit(null, this);
    }
}
