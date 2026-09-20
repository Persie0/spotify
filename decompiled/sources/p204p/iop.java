package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class iop extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f104263a;

    /* JADX INFO: renamed from: b */
    public int f104264b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hop f104265c;

    /* JADX INFO: renamed from: d */
    public int f104266d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iop(hop hopVar, fbk fbkVar) {
        super(fbkVar);
        this.f104265c = hopVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f104263a = obj;
        this.f104264b |= Integer.MIN_VALUE;
        return this.f104265c.emit(null, this);
    }
}
