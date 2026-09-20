package p204p;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public class uf60 extends eg60 implements juf {

    /* JADX INFO: renamed from: c */
    public final boolean f229698c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf60(tf60 tf60Var) {
        super(true);
        boolean z = true;
        m38795h0(tf60Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = eg60.f59230b;
        q3e q3eVar = (q3e) atomicReferenceFieldUpdater.get(this);
        r3e r3eVar = q3eVar instanceof r3e ? (r3e) q3eVar : null;
        if (r3eVar == null) {
            z = false;
            break;
        }
        eg60 eg60VarM85348h = r3eVar.m85348h();
        while (!eg60VarM85348h.mo38789b0()) {
            q3e q3eVar2 = (q3e) atomicReferenceFieldUpdater.get(eg60VarM85348h);
            r3e r3eVar2 = q3eVar2 instanceof r3e ? (r3e) q3eVar2 : null;
            if (r3eVar2 == null) {
                z = false;
                break;
            }
            eg60VarM85348h = r3eVar2.m85348h();
        }
        this.f229698c = z;
    }

    @Override // p204p.eg60
    /* JADX INFO: renamed from: b0 */
    public final boolean mo38789b0() {
        return this.f229698c;
    }

    @Override // p204p.eg60
    /* JADX INFO: renamed from: d0 */
    public final boolean mo38791d0() {
        return true;
    }
}
