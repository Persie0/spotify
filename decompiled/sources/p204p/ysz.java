package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ysz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f275902a;

    /* JADX INFO: renamed from: b */
    public int f275903b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ flz f275904c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ysz(flz flzVar, fbk fbkVar) {
        super(fbkVar);
        this.f275904c = flzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f275902a = obj;
        this.f275903b |= Integer.MIN_VALUE;
        return this.f275904c.emit(null, this);
    }
}
