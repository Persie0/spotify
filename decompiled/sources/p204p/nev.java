package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class nev extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f153115a;

    /* JADX INFO: renamed from: b */
    public int f153116b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b3t f153117c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nev(b3t b3tVar, fbk fbkVar) {
        super(fbkVar);
        this.f153117c = b3tVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f153115a = obj;
        this.f153116b |= Integer.MIN_VALUE;
        return this.f153117c.emit(null, this);
    }
}
