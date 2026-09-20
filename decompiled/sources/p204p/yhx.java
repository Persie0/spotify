package p204p;

import androidx.compose.p002ui.geometry.Offset;

/* JADX INFO: loaded from: classes3.dex */
public final class yhx implements vfj0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zhx f272986a;

    public yhx(zhx zhxVar) {
        this.f272986a = zhxVar;
    }

    @Override // p204p.vfj0
    /* JADX INFO: renamed from: P */
    public final long mo25861P(int i, long j) {
        zhx zhxVar = this.f272986a;
        c581 c581Var = zhxVar.f283017a;
        if (!((Boolean) zhxVar.f283020d.invoke()).booleanValue()) {
            return 0L;
        }
        int i2 = (int) (4294967295L & j);
        if (Float.intBitsToFloat(i2) > 0.0f) {
            return 0L;
        }
        float fM84031v = c581Var.f34107c.m84031v();
        c581Var.m31458b(Float.intBitsToFloat(i2) + c581Var.f34107c.m84031v());
        if (fM84031v == c581Var.f34107c.m84031v()) {
            return 0L;
        }
        return Offset.m251a(0.0f, 2, j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // p204p.vfj0
    /* JADX INFO: renamed from: S0 */
    public final Object mo25862S0(long j, long j2, fbk fbkVar) {
        xhx xhxVar;
        long j3;
        zhx zhxVar = this.f272986a;
        c581 c581Var = zhxVar.f283017a;
        if (fbkVar instanceof xhx) {
            xhxVar = (xhx) fbkVar;
            int i = xhxVar.f261728d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xhxVar.f261728d = i - Integer.MIN_VALUE;
            } else {
                xhxVar = new xhx(this, (ibk) fbkVar);
            }
        } else {
            xhxVar = new xhx(this, (ibk) fbkVar);
        }
        Object m5b1Var = xhxVar.f261726b;
        int i2 = xhxVar.f261728d;
        Object obj = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                j2 = xhxVar.f261725a;
                bga.m29073P(m5b1Var);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j3 = xhxVar.f261725a;
                bga.m29073P(m5b1Var);
            }
            return new m5b1(m5b1.m60857g(j3, ((m5b1) m5b1Var).f140181a));
        }
        bga.m29073P(m5b1Var);
        if (m5b1.m60855e(j2) > 0.0f) {
            c581Var.f34106b.m84032w(0.0f);
        }
        xhxVar.f261725a = j2;
        xhxVar.f261728d = 1;
        m5b1Var = new m5b1(0L);
        if (m5b1Var != obj) {
        }
        return obj;
        long j4 = ((m5b1) m5b1Var).f140181a;
        float fM60855e = m5b1.m60855e(j2);
        ypo ypoVar = zhxVar.f283019c;
        pg41 pg41Var = zhxVar.f283018b;
        xhxVar.f261725a = j4;
        xhxVar.f261728d = 2;
        m5b1Var = w45.m87131g(c581Var, fM60855e, ypoVar, pg41Var, xhxVar);
        if (m5b1Var != obj) {
            j3 = j4;
            return new m5b1(m5b1.m60857g(j3, ((m5b1) m5b1Var).f140181a));
        }
        return obj;
    }

    @Override // p204p.vfj0
    /* JADX INFO: renamed from: k0 */
    public final long mo25863k0(int i, long j, long j2) {
        zhx zhxVar = this.f272986a;
        c581 c581Var = zhxVar.f283017a;
        if (!((Boolean) zhxVar.f283020d.invoke()).booleanValue()) {
            return 0L;
        }
        int i2 = (int) (j & 4294967295L);
        c581Var.f34106b.m84032w(Float.intBitsToFloat(i2) + c581Var.f34106b.m84031v());
        int i3 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i3) < 0.0f || Float.intBitsToFloat(i2) < 0.0f) {
            float fM84031v = c581Var.f34107c.m84031v();
            c581Var.m31458b(Float.intBitsToFloat(i2) + c581Var.f34107c.m84031v());
            return (((long) Float.floatToRawIntBits(c581Var.f34107c.m84031v() - fM84031v)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
        }
        if (Float.intBitsToFloat(i3) <= 0.0f) {
            return 0L;
        }
        float fM84031v2 = c581Var.f34107c.m84031v();
        c581Var.m31458b(Float.intBitsToFloat(i3) + c581Var.f34107c.m84031v());
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(c581Var.f34107c.m84031v() - fM84031v2)) & 4294967295L);
    }
}
