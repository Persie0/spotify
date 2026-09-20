package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class tmz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f221801a;

    /* JADX INFO: renamed from: b */
    public int f221802b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fwj f221803c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tmz(fwj fwjVar, fbk fbkVar) {
        super(fbkVar);
        this.f221803c = fwjVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f221801a = obj;
        this.f221802b |= Integer.MIN_VALUE;
        return this.f221803c.emit(null, this);
    }
}
