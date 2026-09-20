package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class bf10 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f26513a;

    /* JADX INFO: renamed from: b */
    public int f26514b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ flz f26515c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf10(flz flzVar, fbk fbkVar) {
        super(fbkVar);
        this.f26515c = flzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f26513a = obj;
        this.f26514b |= Integer.MIN_VALUE;
        return this.f26515c.emit(null, this);
    }
}
