package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class imm0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f103751a;

    /* JADX INFO: renamed from: b */
    public int f103752b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cgm0 f103753c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imm0(cgm0 cgm0Var, fbk fbkVar) {
        super(fbkVar);
        this.f103753c = cgm0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f103751a = obj;
        this.f103752b |= Integer.MIN_VALUE;
        return this.f103753c.emit(null, this);
    }
}
