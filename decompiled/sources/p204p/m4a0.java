package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class m4a0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f139881a;

    /* JADX INFO: renamed from: b */
    public int f139882b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i2a0 f139883c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4a0(i2a0 i2a0Var, fbk fbkVar) {
        super(fbkVar);
        this.f139883c = i2a0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f139881a = obj;
        this.f139882b |= Integer.MIN_VALUE;
        return this.f139883c.emit(null, this);
    }
}
