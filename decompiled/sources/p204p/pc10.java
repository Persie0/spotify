package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pc10 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f175931a;

    /* JADX INFO: renamed from: b */
    public int f175932b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ flz f175933c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc10(flz flzVar, fbk fbkVar) {
        super(fbkVar);
        this.f175933c = flzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f175931a = obj;
        this.f175932b |= Integer.MIN_VALUE;
        return this.f175933c.emit(null, this);
    }
}
