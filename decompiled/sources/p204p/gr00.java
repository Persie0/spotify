package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gr00 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f83589a;

    /* JADX INFO: renamed from: b */
    public int f83590b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ flz f83591c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr00(flz flzVar, fbk fbkVar) {
        super(fbkVar);
        this.f83591c = flzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f83589a = obj;
        this.f83590b |= Integer.MIN_VALUE;
        return this.f83591c.emit(null, this);
    }
}
