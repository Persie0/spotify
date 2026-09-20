package p204p;

import androidx.car.app.model.Alert;
import androidx.compose.p002ui.unit.TextUnit;

/* JADX INFO: loaded from: classes.dex */
public interface yqq {
    /* JADX INFO: renamed from: D */
    default float mo26962D(long j) {
        float fM308c;
        float fMo24617W0;
        if (!tf71.m80605a(TextUnit.m307b(j), 4294967296L)) {
            ot40.m67768b("Only Sp can convert to Px");
        }
        float[] fArr = b000.f21718a;
        if (mo24617W0() >= 1.03f) {
            a000 a000VarM27711a = b000.m27711a(mo24617W0());
            fM308c = TextUnit.m308c(j);
            if (a000VarM27711a != null) {
                return a000VarM27711a.mo24308b(fM308c);
            }
            fMo24617W0 = mo24617W0();
        } else {
            fM308c = TextUnit.m308c(j);
            fMo24617W0 = mo24617W0();
        }
        return fMo24617W0 * fM308c;
    }

    /* JADX INFO: renamed from: L */
    default long mo35985L(int i) {
        return mo26963y(mo35987O0(i));
    }

    /* JADX INFO: renamed from: O */
    default long mo35986O(float f) {
        return mo26963y(mo35988P0(f));
    }

    /* JADX INFO: renamed from: O0 */
    default float mo35987O0(int i) {
        return i / mo24619j();
    }

    /* JADX INFO: renamed from: P0 */
    default float mo35988P0(float f) {
        return f / mo24619j();
    }

    /* JADX INFO: renamed from: W0 */
    float mo24617W0();

    /* JADX INFO: renamed from: Z0 */
    default float mo35989Z0(float f) {
        return mo24619j() * f;
    }

    /* JADX INFO: renamed from: j */
    float mo24619j();

    /* JADX INFO: renamed from: l0 */
    default int mo35990l0(float f) {
        float fMo35989Z0 = mo35989Z0(f);
        return Float.isInfinite(fMo35989Z0) ? Alert.DURATION_SHOW_INDEFINITELY : Math.round(fMo35989Z0);
    }

    /* JADX INFO: renamed from: l1 */
    default long mo35991l1(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fMo35989Z0 = mo35989Z0(bcs.m28782b(j));
        return (((long) Float.floatToRawIntBits(mo35989Z0(bcs.m28781a(j)))) & 4294967295L) | (Float.floatToRawIntBits(fMo35989Z0) << 32);
    }

    /* JADX INFO: renamed from: t0 */
    default float mo28377t0(long j) {
        if (!tf71.m80605a(TextUnit.m307b(j), 4294967296L)) {
            ot40.m67768b("Only Sp can convert to Px");
        }
        return mo35989Z0(mo26962D(j));
    }

    /* JADX INFO: renamed from: y */
    default long mo26963y(float f) {
        float[] fArr = b000.f21718a;
        if (mo24617W0() < 1.03f) {
            return epv0.m39669E(4294967296L, f / mo24617W0());
        }
        a000 a000VarM27711a = b000.m27711a(mo24617W0());
        return epv0.m39669E(4294967296L, a000VarM27711a != null ? a000VarM27711a.mo24307a(f) : f / mo24617W0());
    }

    /* JADX INFO: renamed from: z */
    default long mo35992z(long j) {
        if (j != 9205357640488583168L) {
            return grl0.m45530c(mo35988P0(Float.intBitsToFloat((int) (j >> 32))), mo35988P0(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }
}
