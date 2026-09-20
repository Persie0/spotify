package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class b7c0 extends ibk {

    /* JADX INFO: renamed from: a */
    public j6c0 f24210a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f24211b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ f7c0 f24212c;

    /* JADX INFO: renamed from: d */
    public int f24213d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7c0(f7c0 f7c0Var, ibk ibkVar) {
        super(ibkVar);
        this.f24212c = f7c0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f24211b = obj;
        this.f24213d |= Integer.MIN_VALUE;
        return f7c0.m40962b(this.f24212c, null, this);
    }
}
