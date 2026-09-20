package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vrl extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f244222a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wrl f244223b;

    /* JADX INFO: renamed from: c */
    public int f244224c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vrl(wrl wrlVar, ibk ibkVar) {
        super(ibkVar);
        this.f244223b = wrlVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f244222a = obj;
        this.f244224c |= Integer.MIN_VALUE;
        return this.f244223b.m88867f(null, null, this);
    }
}
