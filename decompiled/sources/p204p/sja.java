package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class sja extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f209789a;

    /* JADX INFO: renamed from: b */
    public int f209790b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ tja f209791c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sja(tja tjaVar, fbk fbkVar) {
        super(fbkVar);
        this.f209791c = tjaVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f209789a = obj;
        this.f209790b |= Integer.MIN_VALUE;
        return this.f209791c.emit(null, this);
    }
}
