package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vvy extends ibk {

    /* JADX INFO: renamed from: a */
    public ovy f245355a;

    /* JADX INFO: renamed from: b */
    public n2x0 f245356b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f245357c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ wvy f245358d;

    /* JADX INFO: renamed from: e */
    public int f245359e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vvy(wvy wvyVar, ibk ibkVar) {
        super(ibkVar);
        this.f245358d = wvyVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f245357c = obj;
        this.f245359e |= Integer.MIN_VALUE;
        return this.f245358d.m89164a(null, null, this);
    }
}
