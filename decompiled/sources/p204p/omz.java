package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class omz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f167115a;

    /* JADX INFO: renamed from: b */
    public int f167116b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ flz f167117c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public omz(flz flzVar, fbk fbkVar) {
        super(fbkVar);
        this.f167117c = flzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f167115a = obj;
        this.f167116b |= Integer.MIN_VALUE;
        return this.f167117c.emit(null, this);
    }
}
