package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ri9 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f199459a;

    /* JADX INFO: renamed from: b */
    public int f199460b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s98 f199461c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri9(s98 s98Var, fbk fbkVar) {
        super(fbkVar);
        this.f199461c = s98Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f199459a = obj;
        this.f199460b |= Integer.MIN_VALUE;
        return this.f199461c.emit(null, this);
    }
}
