package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class sv7 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f214351a;

    /* JADX INFO: renamed from: b */
    public int f214352b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wd5 f214353c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv7(wd5 wd5Var, fbk fbkVar) {
        super(fbkVar);
        this.f214353c = wd5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f214351a = obj;
        this.f214352b |= Integer.MIN_VALUE;
        return this.f214353c.emit(null, this);
    }
}
