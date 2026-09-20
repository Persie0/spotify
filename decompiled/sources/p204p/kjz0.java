package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class kjz0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f123457a;

    /* JADX INFO: renamed from: b */
    public int f123458b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ady0 f123459c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kjz0(ady0 ady0Var, fbk fbkVar) {
        super(fbkVar);
        this.f123459c = ady0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f123457a = obj;
        this.f123458b |= Integer.MIN_VALUE;
        return this.f123459c.emit(null, this);
    }
}
