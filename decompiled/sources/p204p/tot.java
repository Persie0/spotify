package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tot extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f222316a;

    /* JADX INFO: renamed from: b */
    public int f222317b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wot f222318c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tot(wot wotVar, ibk ibkVar) {
        super(ibkVar);
        this.f222318c = wotVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f222316a = obj;
        this.f222317b |= Integer.MIN_VALUE;
        return this.f222318c.mo15629a(null, null, this);
    }
}
