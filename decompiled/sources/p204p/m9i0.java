package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class m9i0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f141316a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ o9i0 f141317b;

    /* JADX INFO: renamed from: c */
    public int f141318c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9i0(o9i0 o9i0Var, ibk ibkVar) {
        super(ibkVar);
        this.f141317b = o9i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f141316a = obj;
        this.f141318c |= Integer.MIN_VALUE;
        return this.f141317b.m66475b(false, this);
    }
}
