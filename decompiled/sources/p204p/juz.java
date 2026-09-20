package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class juz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f116196a;

    /* JADX INFO: renamed from: b */
    public int f116197b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ flz f116198c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public juz(flz flzVar, fbk fbkVar) {
        super(fbkVar);
        this.f116198c = flzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f116196a = obj;
        this.f116197b |= Integer.MIN_VALUE;
        return this.f116198c.emit(null, this);
    }
}
