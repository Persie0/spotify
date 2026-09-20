package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jmm0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f113906a;

    /* JADX INFO: renamed from: b */
    public int f113907b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cgm0 f113908c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmm0(cgm0 cgm0Var, fbk fbkVar) {
        super(fbkVar);
        this.f113908c = cgm0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f113906a = obj;
        this.f113907b |= Integer.MIN_VALUE;
        return this.f113908c.emit(null, this);
    }
}
