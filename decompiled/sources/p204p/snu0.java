package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class snu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f211027a;

    /* JADX INFO: renamed from: b */
    public int f211028b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jcu0 f211029c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public snu0(jcu0 jcu0Var, fbk fbkVar) {
        super(fbkVar);
        this.f211029c = jcu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f211027a = obj;
        this.f211028b |= Integer.MIN_VALUE;
        return this.f211029c.emit(null, this);
    }
}
