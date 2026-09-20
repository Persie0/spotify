package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zfk extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f282332a;

    /* JADX INFO: renamed from: b */
    public int f282333b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lxi f282334c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zfk(lxi lxiVar, fbk fbkVar) {
        super(fbkVar);
        this.f282334c = lxiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f282332a = obj;
        this.f282333b |= Integer.MIN_VALUE;
        return this.f282334c.emit(null, this);
    }
}
