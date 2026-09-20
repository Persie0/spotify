package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class m4u extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f140023a;

    /* JADX INFO: renamed from: b */
    public int f140024b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b3t f140025c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4u(b3t b3tVar, fbk fbkVar) {
        super(fbkVar);
        this.f140025c = b3tVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f140023a = obj;
        this.f140024b |= Integer.MIN_VALUE;
        return this.f140025c.emit(null, this);
    }
}
