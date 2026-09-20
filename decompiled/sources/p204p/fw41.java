package p204p;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class fw41 extends AbstractC2368s9 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f73936a = new AtomicReference(null);

    @Override // p204p.AbstractC2368s9
    /* JADX INFO: renamed from: a */
    public final boolean mo42937a(AbstractC2330r9 abstractC2330r9) {
        AtomicReference atomicReference = this.f73936a;
        if (ftg1.m42665y(atomicReference) != null) {
            return false;
        }
        ftg1.m42638D(atomicReference, jag1.f110462a);
        return true;
    }

    @Override // p204p.AbstractC2368s9
    /* JADX INFO: renamed from: b */
    public final fbk[] mo42938b(AbstractC2330r9 abstractC2330r9) {
        ftg1.m42638D(this.f73936a, null);
        return tg1.f220101a;
    }
}
