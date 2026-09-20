package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class nxd extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f159443a;

    /* JADX INFO: renamed from: b */
    public int f159444b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqc f159445c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxd(kqc kqcVar, fbk fbkVar) {
        super(fbkVar);
        this.f159445c = kqcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f159443a = obj;
        this.f159444b |= Integer.MIN_VALUE;
        return this.f159445c.emit(null, this);
    }
}
