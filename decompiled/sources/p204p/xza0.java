package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class xza0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f267566a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zza0 f267567b;

    /* JADX INFO: renamed from: c */
    public int f267568c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xza0(zza0 zza0Var, ibk ibkVar) {
        super(ibkVar);
        this.f267567b = zza0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f267566a = obj;
        this.f267568c |= Integer.MIN_VALUE;
        return this.f267567b.m97286a(this);
    }
}
