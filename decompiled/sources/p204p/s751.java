package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class s751 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f206282a;

    /* JADX INFO: renamed from: b */
    public int f206283b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wli0 f206284c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s751(wli0 wli0Var, fbk fbkVar) {
        super(fbkVar);
        this.f206284c = wli0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f206282a = obj;
        this.f206283b |= Integer.MIN_VALUE;
        return this.f206284c.emit(null, this);
    }
}
