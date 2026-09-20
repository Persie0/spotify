package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class mm01 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f144997a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nm01 f144998b;

    /* JADX INFO: renamed from: c */
    public int f144999c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mm01(nm01 nm01Var, ibk ibkVar) {
        super(ibkVar);
        this.f144998b = nm01Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f144997a = obj;
        this.f144999c |= Integer.MIN_VALUE;
        return this.f144998b.m64771e(null, null, false, null, this);
    }
}
