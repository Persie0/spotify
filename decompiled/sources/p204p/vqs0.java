package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vqs0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f243994a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wqs0 f243995b;

    /* JADX INFO: renamed from: c */
    public int f243996c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vqs0(wqs0 wqs0Var, ibk ibkVar) {
        super(ibkVar);
        this.f243995b = wqs0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f243994a = obj;
        this.f243996c |= Integer.MIN_VALUE;
        return this.f243995b.m88790c(this);
    }
}
