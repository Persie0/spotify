package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ib11 extends AbstractC2368s9 {

    /* JADX INFO: renamed from: a */
    public long f100413a;

    /* JADX INFO: renamed from: b */
    public hqb f100414b;

    @Override // p204p.AbstractC2368s9
    /* JADX INFO: renamed from: a */
    public final boolean mo42937a(AbstractC2330r9 abstractC2330r9) {
        hb11 hb11Var = (hb11) abstractC2330r9;
        if (this.f100413a >= 0) {
            return false;
        }
        long j = hb11Var.f89364i;
        if (j < hb11Var.f89365t) {
            hb11Var.f89365t = j;
        }
        this.f100413a = j;
        return true;
    }

    @Override // p204p.AbstractC2368s9
    /* JADX INFO: renamed from: b */
    public final fbk[] mo42938b(AbstractC2330r9 abstractC2330r9) {
        long j = this.f100413a;
        this.f100413a = -1L;
        this.f100414b = null;
        return ((hb11) abstractC2330r9).m46977w(j);
    }
}
