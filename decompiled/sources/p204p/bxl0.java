package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bxl0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f31919a;

    /* JADX INFO: renamed from: b */
    public int f31920b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ evk0 f31921c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxl0(evk0 evk0Var, fbk fbkVar) {
        super(fbkVar);
        this.f31921c = evk0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f31919a = obj;
        this.f31920b |= Integer.MIN_VALUE;
        return this.f31921c.emit(null, this);
    }
}
