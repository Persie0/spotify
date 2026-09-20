package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class mpj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f146042a;

    /* JADX INFO: renamed from: b */
    public int f146043b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c3i0 f146044c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mpj0(c3i0 c3i0Var, fbk fbkVar) {
        super(fbkVar);
        this.f146044c = c3i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f146042a = obj;
        this.f146043b |= Integer.MIN_VALUE;
        return this.f146044c.emit(null, this);
    }
}
