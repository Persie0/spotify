package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vq41 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f243874a;

    /* JADX INFO: renamed from: b */
    public int f243875b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wli0 f243876c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq41(wli0 wli0Var, fbk fbkVar) {
        super(fbkVar);
        this.f243876c = wli0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f243874a = obj;
        this.f243875b |= Integer.MIN_VALUE;
        return this.f243876c.emit(null, this);
    }
}
