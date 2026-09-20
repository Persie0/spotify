package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vvs0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f245301a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wvs0 f245302b;

    /* JADX INFO: renamed from: c */
    public int f245303c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vvs0(wvs0 wvs0Var, ibk ibkVar) {
        super(ibkVar);
        this.f245302b = wvs0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f245301a = obj;
        this.f245303c |= Integer.MIN_VALUE;
        return wvs0.m89157a(this.f245302b, null, this);
    }
}
