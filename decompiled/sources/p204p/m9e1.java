package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class m9e1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f141286a;

    /* JADX INFO: renamed from: b */
    public int f141287b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ di91 f141288c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9e1(di91 di91Var, fbk fbkVar) {
        super(fbkVar);
        this.f141288c = di91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f141286a = obj;
        this.f141287b |= Integer.MIN_VALUE;
        return this.f141288c.emit(null, this);
    }
}
