package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class pyj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f183420a;

    /* JADX INFO: renamed from: b */
    public int f183421b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c3i0 f183422c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pyj0(c3i0 c3i0Var, fbk fbkVar) {
        super(fbkVar);
        this.f183422c = c3i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f183420a = obj;
        this.f183421b |= Integer.MIN_VALUE;
        return this.f183422c.emit(null, this);
    }
}
