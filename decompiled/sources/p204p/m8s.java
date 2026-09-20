package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class m8s extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f141119a;

    /* JADX INFO: renamed from: b */
    public int f141120b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a1s f141121c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8s(a1s a1sVar, fbk fbkVar) {
        super(fbkVar);
        this.f141121c = a1sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f141119a = obj;
        this.f141120b |= Integer.MIN_VALUE;
        return this.f141121c.emit(null, this);
    }
}
