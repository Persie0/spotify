package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class i9x0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f100097a;

    /* JADX INFO: renamed from: b */
    public int f100098b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bvv0 f100099c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9x0(bvv0 bvv0Var, fbk fbkVar) {
        super(fbkVar);
        this.f100099c = bvv0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f100097a = obj;
        this.f100098b |= Integer.MIN_VALUE;
        return this.f100099c.emit(null, this);
    }
}
