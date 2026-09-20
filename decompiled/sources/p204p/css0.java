package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class css0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f41687a;

    /* JADX INFO: renamed from: b */
    public int f41688b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dss0 f41689c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public css0(dss0 dss0Var, fbk fbkVar) {
        super(fbkVar);
        this.f41689c = dss0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f41687a = obj;
        this.f41688b |= Integer.MIN_VALUE;
        return this.f41689c.emit(null, this);
    }
}
