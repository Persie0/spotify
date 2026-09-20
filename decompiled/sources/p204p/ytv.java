package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ytv extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f276222a;

    /* JADX INFO: renamed from: b */
    public int f276223b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ umv f276224c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ytv(umv umvVar, fbk fbkVar) {
        super(fbkVar);
        this.f276224c = umvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f276222a = obj;
        this.f276223b |= Integer.MIN_VALUE;
        return this.f276224c.emit(null, this);
    }
}
