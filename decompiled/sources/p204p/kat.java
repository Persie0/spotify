package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class kat extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f120959a;

    /* JADX INFO: renamed from: b */
    public int f120960b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b3t f120961c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kat(b3t b3tVar, fbk fbkVar) {
        super(fbkVar);
        this.f120961c = b3tVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f120959a = obj;
        this.f120960b |= Integer.MIN_VALUE;
        return this.f120961c.emit(null, this);
    }
}
