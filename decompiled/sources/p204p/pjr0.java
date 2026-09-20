package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class pjr0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f178302a;

    /* JADX INFO: renamed from: b */
    public int f178303b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dar0 f178304c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pjr0(dar0 dar0Var, fbk fbkVar) {
        super(fbkVar);
        this.f178304c = dar0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f178302a = obj;
        this.f178303b |= Integer.MIN_VALUE;
        return this.f178304c.emit(null, this);
    }
}
