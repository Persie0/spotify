package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class usi extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f233637a;

    /* JADX INFO: renamed from: b */
    public int f233638b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7i f233639c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public usi(i7i i7iVar, fbk fbkVar) {
        super(fbkVar);
        this.f233639c = i7iVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f233637a = obj;
        this.f233638b |= Integer.MIN_VALUE;
        return this.f233639c.emit(null, this);
    }
}
