package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class lmz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f135051a;

    /* JADX INFO: renamed from: b */
    public int f135052b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ flz f135053c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lmz(flz flzVar, fbk fbkVar) {
        super(fbkVar);
        this.f135053c = flzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f135051a = obj;
        this.f135052b |= Integer.MIN_VALUE;
        return this.f135053c.emit(null, this);
    }
}
