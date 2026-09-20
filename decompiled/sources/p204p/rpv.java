package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rpv extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f201648a;

    /* JADX INFO: renamed from: b */
    public int f201649b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ umv f201650c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rpv(umv umvVar, fbk fbkVar) {
        super(fbkVar);
        this.f201650c = umvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f201648a = obj;
        this.f201649b |= Integer.MIN_VALUE;
        return this.f201650c.emit(null, this);
    }
}
