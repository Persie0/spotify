package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class maa1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f141546a;

    /* JADX INFO: renamed from: b */
    public int f141547b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ie91 f141548c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public maa1(ie91 ie91Var, fbk fbkVar) {
        super(fbkVar);
        this.f141548c = ie91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f141546a = obj;
        this.f141547b |= Integer.MIN_VALUE;
        return this.f141548c.emit(null, this);
    }
}
