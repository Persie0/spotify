package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class glv0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f81187a;

    /* JADX INFO: renamed from: b */
    public int f81188b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jcu0 f81189c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public glv0(jcu0 jcu0Var, fbk fbkVar) {
        super(fbkVar);
        this.f81189c = jcu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f81187a = obj;
        this.f81188b |= Integer.MIN_VALUE;
        return this.f81189c.emit(null, this);
    }
}
