package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class b951 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24775a;

    /* JADX INFO: renamed from: b */
    public int f24776b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zc01 f24777c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b951(zc01 zc01Var, fbk fbkVar) {
        super(fbkVar);
        this.f24777c = zc01Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f24775a = obj;
        this.f24776b |= Integer.MIN_VALUE;
        return this.f24777c.emit(null, this);
    }
}
