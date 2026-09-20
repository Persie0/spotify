package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class sby extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f207597a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zby f207598b;

    /* JADX INFO: renamed from: c */
    public int f207599c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sby(zby zbyVar, ibk ibkVar) {
        super(ibkVar);
        this.f207598b = zbyVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f207597a = obj;
        this.f207599c |= Integer.MIN_VALUE;
        return this.f207598b.m95886c(null, this);
    }
}
