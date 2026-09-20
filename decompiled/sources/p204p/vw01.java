package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vw01 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f245372a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ el6 f245373b;

    /* JADX INFO: renamed from: c */
    public int f245374c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw01(el6 el6Var, ibk ibkVar) {
        super(ibkVar);
        this.f245373b = el6Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f245372a = obj;
        this.f245374c |= Integer.MIN_VALUE;
        return this.f245373b.m39356d(null, this);
    }
}
