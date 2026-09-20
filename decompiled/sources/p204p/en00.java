package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class en00 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f61036a;

    /* JADX INFO: renamed from: b */
    public int f61037b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ flz f61038c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en00(flz flzVar, fbk fbkVar) {
        super(fbkVar);
        this.f61038c = flzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f61036a = obj;
        this.f61037b |= Integer.MIN_VALUE;
        return this.f61038c.emit(null, this);
    }
}
