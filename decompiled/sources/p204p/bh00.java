package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bh00 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f27041a;

    /* JADX INFO: renamed from: b */
    public int f27042b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ flz f27043c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh00(flz flzVar, fbk fbkVar) {
        super(fbkVar);
        this.f27043c = flzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f27041a = obj;
        this.f27042b |= Integer.MIN_VALUE;
        return this.f27043c.emit(null, this);
    }
}
