package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class usz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f233699a;

    /* JADX INFO: renamed from: b */
    public int f233700b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ flz f233701c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public usz(flz flzVar, fbk fbkVar) {
        super(fbkVar);
        this.f233701c = flzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f233699a = obj;
        this.f233700b |= Integer.MIN_VALUE;
        return this.f233701c.emit(null, this);
    }
}
