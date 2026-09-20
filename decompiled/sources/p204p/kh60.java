package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kh60 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f122532a;

    /* JADX INFO: renamed from: b */
    public int f122533b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gtt f122534c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh60(gtt gttVar, fbk fbkVar) {
        super(fbkVar);
        this.f122534c = gttVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f122532a = obj;
        this.f122533b |= Integer.MIN_VALUE;
        return this.f122534c.emit(null, this);
    }
}
