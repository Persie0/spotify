package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class m8m0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f141094a;

    /* JADX INFO: renamed from: b */
    public int f141095b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7m0 f141096c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8m0(i7m0 i7m0Var, fbk fbkVar) {
        super(fbkVar);
        this.f141096c = i7m0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f141094a = obj;
        this.f141095b |= Integer.MIN_VALUE;
        return this.f141096c.emit(null, this);
    }
}
