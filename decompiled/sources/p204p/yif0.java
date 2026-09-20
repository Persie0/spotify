package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class yif0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f273110a;

    /* JADX INFO: renamed from: b */
    public int f273111b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nif0 f273112c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yif0(nif0 nif0Var, fbk fbkVar) {
        super(fbkVar);
        this.f273112c = nif0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f273110a = obj;
        this.f273111b |= Integer.MIN_VALUE;
        return this.f273112c.emit(null, this);
    }
}
