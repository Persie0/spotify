package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class mpl extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f146046a;

    /* JADX INFO: renamed from: b */
    public int f146047b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hb3 f146048c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mpl(hb3 hb3Var, fbk fbkVar) {
        super(fbkVar);
        this.f146048c = hb3Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f146046a = obj;
        this.f146047b |= Integer.MIN_VALUE;
        return this.f146048c.emit(null, this);
    }
}
