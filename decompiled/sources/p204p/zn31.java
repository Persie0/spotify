package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zn31 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f284399a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fo31 f284400b;

    /* JADX INFO: renamed from: c */
    public int f284401c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn31(fo31 fo31Var, ibk ibkVar) {
        super(ibkVar);
        this.f284400b = fo31Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f284399a = obj;
        this.f284401c |= Integer.MIN_VALUE;
        return this.f284400b.m42263e(null, null, 0L, this);
    }
}
