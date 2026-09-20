package p204p;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: classes11.dex */
public final class tkz implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f221274a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rlv0 f221275b;

    public /* synthetic */ tkz(rlv0 rlv0Var, int i) {
        this.f221274a = i;
        this.f221275b = rlv0Var;
    }

    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        switch (this.f221274a) {
            case 0:
                this.f221275b.f200373a = obj;
                throw new AbortFlowException(this);
            case 1:
                this.f221275b.f200373a = obj;
                throw new AbortFlowException(this);
            default:
                this.f221275b.f200373a = obj;
                return w2a1.f247311a;
        }
    }
}
