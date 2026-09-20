package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ydx extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f271873a;

    /* JADX INFO: renamed from: b */
    public int f271874b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ umv f271875c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydx(umv umvVar, fbk fbkVar) {
        super(fbkVar);
        this.f271875c = umvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f271873a = obj;
        this.f271874b |= Integer.MIN_VALUE;
        return this.f271875c.emit(null, this);
    }
}
