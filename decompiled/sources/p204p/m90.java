package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class m90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f141180a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ n90 f141181b;

    /* JADX INFO: renamed from: c */
    public int f141182c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m90(n90 n90Var, fbk fbkVar) {
        super(fbkVar);
        this.f141181b = n90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f141180a = obj;
        this.f141182c |= Integer.MIN_VALUE;
        return this.f141181b.m63876k(this);
    }
}
