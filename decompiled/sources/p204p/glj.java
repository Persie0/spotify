package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class glj extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f81099a;

    /* JADX INFO: renamed from: b */
    public int f81100b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lxi f81101c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public glj(lxi lxiVar, fbk fbkVar) {
        super(fbkVar);
        this.f81101c = lxiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f81099a = obj;
        this.f81100b |= Integer.MIN_VALUE;
        return this.f81101c.emit(null, this);
    }
}
