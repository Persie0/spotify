package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class kgk extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f122410a;

    /* JADX INFO: renamed from: b */
    public int f122411b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lxi f122412c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kgk(lxi lxiVar, fbk fbkVar) {
        super(fbkVar);
        this.f122412c = lxiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f122410a = obj;
        this.f122411b |= Integer.MIN_VALUE;
        return this.f122412c.emit(null, this);
    }
}
