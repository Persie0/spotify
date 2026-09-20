package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class rj7 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f199728a;

    /* JADX INFO: renamed from: b */
    public int f199729b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wd5 f199730c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj7(wd5 wd5Var, fbk fbkVar) {
        super(fbkVar);
        this.f199730c = wd5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f199728a = obj;
        this.f199729b |= Integer.MIN_VALUE;
        return this.f199730c.emit(null, this);
    }
}
