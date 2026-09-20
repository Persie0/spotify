package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class uvk0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f234462a;

    /* JADX INFO: renamed from: b */
    public int f234463b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ evk0 f234464c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uvk0(evk0 evk0Var, fbk fbkVar) {
        super(fbkVar);
        this.f234464c = evk0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f234462a = obj;
        this.f234463b |= Integer.MIN_VALUE;
        return this.f234464c.emit(null, this);
    }
}
