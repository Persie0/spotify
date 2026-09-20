package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class t1a extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f216201a;

    /* JADX INFO: renamed from: b */
    public int f216202b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ q1a f216203c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1a(q1a q1aVar, fbk fbkVar) {
        super(fbkVar);
        this.f216203c = q1aVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f216201a = obj;
        this.f216202b |= Integer.MIN_VALUE;
        return this.f216203c.emit(null, this);
    }
}
