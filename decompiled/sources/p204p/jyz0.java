package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jyz0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f117524a;

    /* JADX INFO: renamed from: b */
    public int f117525b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ady0 f117526c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyz0(ady0 ady0Var, fbk fbkVar) {
        super(fbkVar);
        this.f117526c = ady0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f117524a = obj;
        this.f117525b |= Integer.MIN_VALUE;
        return this.f117526c.emit(null, this);
    }
}
