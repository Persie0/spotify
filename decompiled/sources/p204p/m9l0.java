package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class m9l0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f141330a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r9l0 f141331b;

    /* JADX INFO: renamed from: c */
    public int f141332c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9l0(r9l0 r9l0Var, fbk fbkVar) {
        super(fbkVar);
        this.f141331b = r9l0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f141330a = obj;
        this.f141332c |= Integer.MIN_VALUE;
        return r9l0.m75078a(this.f141331b, this);
    }
}
