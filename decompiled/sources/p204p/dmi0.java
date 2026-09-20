package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dmi0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f50536a;

    /* JADX INFO: renamed from: b */
    public rlv0 f50537b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f50538c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ imi0 f50539d;

    /* JADX INFO: renamed from: e */
    public int f50540e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmi0(imi0 imi0Var, ibk ibkVar) {
        super(ibkVar);
        this.f50539d = imi0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f50538c = obj;
        this.f50540e |= Integer.MIN_VALUE;
        return this.f50539d.m51095a(null, this);
    }
}
