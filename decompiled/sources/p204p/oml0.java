package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class oml0 extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f167055a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f167056b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ uml0 f167057c;

    /* JADX INFO: renamed from: d */
    public int f167058d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oml0(uml0 uml0Var, ibk ibkVar) {
        super(ibkVar);
        this.f167057c = uml0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f167056b = obj;
        this.f167058d |= Integer.MIN_VALUE;
        return this.f167057c.m83458e(false, this);
    }
}
