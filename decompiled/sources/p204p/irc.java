package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class irc extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f104947a;

    /* JADX INFO: renamed from: b */
    public int f104948b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqc f104949c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public irc(kqc kqcVar, fbk fbkVar) {
        super(fbkVar);
        this.f104949c = kqcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f104947a = obj;
        this.f104948b |= Integer.MIN_VALUE;
        return this.f104949c.emit(null, this);
    }
}
