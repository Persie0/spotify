package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class mf10 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f142927a;

    /* JADX INFO: renamed from: b */
    public int f142928b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ flz f142929c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf10(flz flzVar, fbk fbkVar) {
        super(fbkVar);
        this.f142929c = flzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f142927a = obj;
        this.f142928b |= Integer.MIN_VALUE;
        return this.f142929c.emit(null, this);
    }
}
