package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class itc extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f105510a;

    /* JADX INFO: renamed from: b */
    public int f105511b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqc f105512c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public itc(kqc kqcVar, fbk fbkVar) {
        super(fbkVar);
        this.f105512c = kqcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f105510a = obj;
        this.f105511b |= Integer.MIN_VALUE;
        return this.f105512c.emit(null, this);
    }
}
