package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class yd00 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f271605a;

    /* JADX INFO: renamed from: b */
    public int f271606b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ flz f271607c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd00(flz flzVar, fbk fbkVar) {
        super(fbkVar);
        this.f271607c = flzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f271605a = obj;
        this.f271606b |= Integer.MIN_VALUE;
        return this.f271607c.emit(null, this);
    }
}
