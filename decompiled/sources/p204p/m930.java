package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class m930 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f141203a;

    /* JADX INFO: renamed from: b */
    public int f141204b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v020 f141205c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m930(v020 v020Var, fbk fbkVar) {
        super(fbkVar);
        this.f141205c = v020Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f141203a = obj;
        this.f141204b |= Integer.MIN_VALUE;
        return this.f141205c.emit(null, this);
    }
}
