package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class s8m0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f206682a;

    /* JADX INFO: renamed from: b */
    public int f206683b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7m0 f206684c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8m0(i7m0 i7m0Var, fbk fbkVar) {
        super(fbkVar);
        this.f206684c = i7m0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f206682a = obj;
        this.f206683b |= Integer.MIN_VALUE;
        return this.f206684c.emit(null, this);
    }
}
