package p204p;

/* JADX INFO: renamed from: p.gw */
/* JADX INFO: loaded from: classes4.dex */
public final class C1912gw extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f84861a;

    /* JADX INFO: renamed from: b */
    public int f84862b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2438u3 f84863c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1912gw(C2438u3 c2438u3, fbk fbkVar) {
        super(fbkVar);
        this.f84863c = c2438u3;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f84861a = obj;
        this.f84862b |= Integer.MIN_VALUE;
        return this.f84863c.emit(null, this);
    }
}
