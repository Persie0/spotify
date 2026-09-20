package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ih60 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f102175a;

    /* JADX INFO: renamed from: b */
    public int f102176b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gtt f102177c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih60(gtt gttVar, fbk fbkVar) {
        super(fbkVar);
        this.f102177c = gttVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f102175a = obj;
        this.f102176b |= Integer.MIN_VALUE;
        return this.f102177c.emit(null, this);
    }
}
