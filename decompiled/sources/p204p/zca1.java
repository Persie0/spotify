package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zca1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f281487a;

    /* JADX INFO: renamed from: b */
    public int f281488b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ie91 f281489c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zca1(ie91 ie91Var, fbk fbkVar) {
        super(fbkVar);
        this.f281489c = ie91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f281487a = obj;
        this.f281488b |= Integer.MIN_VALUE;
        return this.f281489c.emit(null, this);
    }
}
