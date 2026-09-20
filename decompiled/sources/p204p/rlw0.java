package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rlw0 extends ibk {

    /* JADX INFO: renamed from: a */
    public Object f200381a;

    /* JADX INFO: renamed from: b */
    public tlw0 f200382b;

    /* JADX INFO: renamed from: c */
    public long f200383c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f200384d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ulw0 f200385e;

    /* JADX INFO: renamed from: f */
    public int f200386f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rlw0(ulw0 ulw0Var, ibk ibkVar) {
        super(ibkVar);
        this.f200385e = ulw0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f200384d = obj;
        this.f200386f |= Integer.MIN_VALUE;
        return this.f200385e.m83411g(null, 0L, this);
    }
}
