package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class c5v0 extends ibk {

    /* JADX INFO: renamed from: a */
    public a8v0 f34293a;

    /* JADX INFO: renamed from: b */
    public j5v0 f34294b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f34295c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ j5v0 f34296d;

    /* JADX INFO: renamed from: e */
    public int f34297e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5v0(j5v0 j5v0Var, ibk ibkVar) {
        super(ibkVar);
        this.f34296d = j5v0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f34295c = obj;
        this.f34297e |= Integer.MIN_VALUE;
        return j5v0.m52476a(this.f34296d, null, null, this);
    }
}
