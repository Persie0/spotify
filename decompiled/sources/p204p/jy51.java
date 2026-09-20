package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jy51 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f117303a;

    /* JADX INFO: renamed from: b */
    public int f117304b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wli0 f117305c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy51(wli0 wli0Var, fbk fbkVar) {
        super(fbkVar);
        this.f117305c = wli0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f117303a = obj;
        this.f117304b |= Integer.MIN_VALUE;
        return this.f117305c.emit(null, this);
    }
}
