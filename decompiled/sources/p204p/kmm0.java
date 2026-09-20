package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class kmm0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f124178a;

    /* JADX INFO: renamed from: b */
    public int f124179b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cgm0 f124180c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmm0(cgm0 cgm0Var, fbk fbkVar) {
        super(fbkVar);
        this.f124180c = cgm0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f124178a = obj;
        this.f124179b |= Integer.MIN_VALUE;
        return this.f124180c.emit(null, this);
    }
}
