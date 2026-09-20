package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mko0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f144617a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ oko0 f144618b;

    /* JADX INFO: renamed from: c */
    public int f144619c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mko0(oko0 oko0Var, ibk ibkVar) {
        super(ibkVar);
        this.f144618b = oko0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f144617a = obj;
        this.f144619c |= Integer.MIN_VALUE;
        return oko0.m67256a(this.f144618b, null, this);
    }
}
