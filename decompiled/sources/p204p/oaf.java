package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class oaf extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f163319a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ paf f163320b;

    /* JADX INFO: renamed from: c */
    public int f163321c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oaf(paf pafVar, fbk fbkVar) {
        super(fbkVar);
        this.f163320b = pafVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f163319a = obj;
        this.f163321c |= Integer.MIN_VALUE;
        return this.f163320b.emit(null, this);
    }
}
