package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class rm2 extends ibk {

    /* JADX INFO: renamed from: a */
    public duc0 f200415a;

    /* JADX INFO: renamed from: b */
    public kq2 f200416b;

    /* JADX INFO: renamed from: c */
    public String f200417c;

    /* JADX INFO: renamed from: d */
    public dl2 f200418d;

    /* JADX INFO: renamed from: e */
    public dl2 f200419e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f200420f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ sm2 f200421g;

    /* JADX INFO: renamed from: h */
    public int f200422h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rm2(sm2 sm2Var, fbk fbkVar) {
        super(fbkVar);
        this.f200421g = sm2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f200420f = obj;
        this.f200422h |= Integer.MIN_VALUE;
        return this.f200421g.m78512e(null, this);
    }
}
