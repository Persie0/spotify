package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class iu7 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f105874a;

    /* JADX INFO: renamed from: b */
    public int f105875b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wd5 f105876c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu7(wd5 wd5Var, fbk fbkVar) {
        super(fbkVar);
        this.f105876c = wd5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f105874a = obj;
        this.f105875b |= Integer.MIN_VALUE;
        return this.f105876c.emit(null, this);
    }
}
