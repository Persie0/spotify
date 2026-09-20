package p204p;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class ab8 extends vf60 {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14039h = AtomicReferenceFieldUpdater.newUpdater(ab8.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;

    /* JADX INFO: renamed from: e */
    public final hqb f14040e;

    /* JADX INFO: renamed from: f */
    public hwr f14041f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ cb8 f14042g;

    public ab8(cb8 cb8Var, hqb hqbVar) {
        this.f14042g = cb8Var;
        this.f14040e = hqbVar;
    }

    @Override // p204p.vf60
    /* JADX INFO: renamed from: i */
    public final boolean mo25338i() {
        return false;
    }

    @Override // p204p.vf60
    /* JADX INFO: renamed from: j */
    public final void mo25339j(Throwable th) {
        hqb hqbVar = this.f14040e;
        if (th != null) {
            hqbVar.getClass();
            C2617yl c2617ylM48209E = hqbVar.m48209E(new ruf(th, false), null);
            if (c2617ylM48209E != null) {
                hqbVar.mo42413F(c2617ylM48209E);
                bb8 bb8Var = (bb8) f14039h.get(this);
                if (bb8Var != null) {
                    bb8Var.m28627b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = cb8.f36043b;
        cb8 cb8Var = this.f14042g;
        if (atomicIntegerFieldUpdater.decrementAndGet(cb8Var) == 0) {
            ojq[] ojqVarArr = cb8Var.f36044a;
            ArrayList arrayList = new ArrayList(ojqVarArr.length);
            for (ojq ojqVar : ojqVarArr) {
                arrayList.add(ojqVar.mo26602f());
            }
            hqbVar.resumeWith(arrayList);
        }
    }
}
