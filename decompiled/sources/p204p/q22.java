package p204p;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import androidx.car.app.model.Alert;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class q22 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f184462a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f184463b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q22(int i, long j) {
        super(1);
        this.f184462a = i;
        this.f184463b = j;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00db  */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        float f;
        Boolean boolValueOf;
        boolean z;
        int i;
        switch (this.f184462a) {
            case 0:
                DrawScope drawScope = (DrawScope) obj;
                int i2 = 0;
                while (i2 < 3) {
                    int i3 = 0;
                    while (i3 < 3) {
                        boolean z2 = i2 == 1;
                        boolean z3 = i3 == 1;
                        if (z2 && z3) {
                            f = 4.5f;
                        } else {
                            f = (z2 || z3) ? 2.75f : 2.0f;
                        }
                        float fM264e = (Size.m264e(drawScope.mo295n()) * (f / 13.4167f)) / 2.0f;
                        float[] fArr = s22.f204877b;
                        DrawScope.m275e0(drawScope, this.f184463b, fM264e, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo295n() >> 32)) * fArr[i3])) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo295n() & 4294967295L)) * fArr[i2])) & 4294967295L), 0.0f, null, 120);
                        i3++;
                    }
                    i2++;
                }
                return w2a1.f247311a;
            case 1:
                return new svk(this.f184463b);
            case 2:
                DrawScope drawScope2 = (DrawScope) obj;
                DrawScope.m275e0(drawScope2, this.f184463b, Size.m264e(drawScope2.mo295n()) / 2, 0L, 0.0f, qxy.f193763a, 108);
                return w2a1.f247311a;
            case 3:
                l3b l3bVar = (l3b) obj;
                Paint paint = new Paint();
                paint.setColor(rfg1.m75429D(this.f184463b));
                paint.setMaskFilter(new BlurMaskFilter(l3bVar.mo24619j() * 16, BlurMaskFilter.Blur.NORMAL));
                return l3bVar.m57995a(new qpf(Float.intBitsToFloat((int) (l3bVar.f129254a.mo39635n() >> 32)) / 2.0f, Float.intBitsToFloat((int) (l3bVar.f129254a.mo39635n() & 4294967295L)) / 2.0f, l3bVar.mo24619j() * 12, paint));
            case 4:
                long j = ((bw31) obj).f31525f.f42624d;
                return Boolean.valueOf(j > 0 && j < this.f184463b);
            case 5:
                return new y350(this.f184463b);
            case 6:
                ezx0 ezx0VarMo63454G1 = ((yyx0) obj).mo63454G1("SELECT * FROM Events WHERE id > ? AND CASE WHEN authenticated IS NULL THEN 1 ELSE authenticated END = 0 ORDER BY id ASC LIMIT ?");
                try {
                    ezx0VarMo63454G1.mo24846u(1, this.f184463b);
                    ezx0VarMo63454G1.mo24846u(2, 40);
                    int iM88306q = wjf1.m88306q(ezx0VarMo63454G1, "id");
                    int iM88306q2 = wjf1.m88306q(ezx0VarMo63454G1, "authenticated");
                    int iM88306q3 = wjf1.m88306q(ezx0VarMo63454G1, "eventName");
                    int iM88306q4 = wjf1.m88306q(ezx0VarMo63454G1, "sequenceId");
                    int iM88306q5 = wjf1.m88306q(ezx0VarMo63454G1, "sequenceNumber");
                    int iM88306q6 = wjf1.m88306q(ezx0VarMo63454G1, "fragments");
                    int iM88306q7 = wjf1.m88306q(ezx0VarMo63454G1, "owner");
                    int iM88306q8 = wjf1.m88306q(ezx0VarMo63454G1, "deviceId");
                    ArrayList arrayList = new ArrayList();
                    while (ezx0VarMo63454G1.mo24841E1()) {
                        c5x c5xVar = new c5x();
                        c5xVar.f34302a = ezx0VarMo63454G1.getLong(iM88306q);
                        Integer numValueOf = ezx0VarMo63454G1.isNull(iM88306q2) ? null : Integer.valueOf((int) ezx0VarMo63454G1.getLong(iM88306q2));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        c5xVar.f34303b = boolValueOf;
                        if (ezx0VarMo63454G1.isNull(iM88306q3)) {
                            c5xVar.f34304c = null;
                        } else {
                            c5xVar.f34304c = ezx0VarMo63454G1.mo24844h1(iM88306q3);
                        }
                        if (ezx0VarMo63454G1.isNull(iM88306q4)) {
                            c5xVar.f34305d = null;
                        } else {
                            c5xVar.f34305d = ezx0VarMo63454G1.getBlob(iM88306q4);
                        }
                        c5xVar.f34306e = ezx0VarMo63454G1.getLong(iM88306q5);
                        if (ezx0VarMo63454G1.isNull(iM88306q6)) {
                            c5xVar.f34307f = null;
                        } else {
                            c5xVar.f34307f = ezx0VarMo63454G1.getBlob(iM88306q6);
                        }
                        if (ezx0VarMo63454G1.isNull(iM88306q7)) {
                            c5xVar.f34308g = null;
                        } else {
                            c5xVar.f34308g = ezx0VarMo63454G1.mo24844h1(iM88306q7);
                        }
                        if (ezx0VarMo63454G1.isNull(iM88306q8)) {
                            c5xVar.f34309h = null;
                        } else {
                            c5xVar.f34309h = ezx0VarMo63454G1.mo24844h1(iM88306q8);
                        }
                        arrayList.add(c5xVar);
                        break;
                    }
                    return arrayList;
                } finally {
                    ezx0VarMo63454G1.close();
                }
            case 7:
                List listM46715L = h6f.m46715L(new n6f(n6f.f150870j), new n6f(n6f.f150862b));
                float f2 = (int) (this.f184463b & 4294967295L);
                DrawScope.m273U0((DrawScope) obj, tm4.m81086D(listM46715L, 0.25f * f2, f2 * 1.0f, 8), 0L, 0L, 0.0f, null, null, 0, 126);
                return w2a1.f247311a;
            case 8:
                ((ox8) ((ExoPlayer) obj)).m68197d1(5, this.f184463b);
                return w2a1.f247311a;
            case 9:
                uw70.m84090b((uw70) obj, Alert.DURATION_SHOW_INDEFINITELY, null, new fyf(new hmb0(this.f184463b), true, -154953258), 6);
                return w2a1.f247311a;
            case 10:
                long j2 = this.f184463b;
                return ((l3b) obj).m57995a(new rjh(tm4.m81087E(new pqm0[]{new pqm0(Float.valueOf(0.0f), new n6f(n6f.m63765b(this.f184463b, 0.0f, 0.0f, 0.0f, 0.0f, 14))), new pqm0(Float.valueOf(0.3f), new n6f(n6f.m63765b(this.f184463b, 0.0f, 0.0f, 0.0f, 0.0f, 14))), new pqm0(Float.valueOf(0.65f), new n6f(n6f.m63765b(this.f184463b, n6f.m63766c(j2) * 0.3f, 0.0f, 0.0f, 0.0f, 14))), new pqm0(Float.valueOf(1.0f), new n6f(j2))}, 0.0f, Float.POSITIVE_INFINITY, 8), 2));
            case 11:
                ezx0 ezx0VarMo63454G2 = ((yyx0) obj).mo63454G1("DELETE FROM messages WHERE messageId = ?");
                try {
                    ezx0VarMo63454G2.mo24846u(1, this.f184463b);
                    ezx0VarMo63454G2.mo24841E1();
                    return w2a1.f247311a;
                } finally {
                    ezx0VarMo63454G2.close();
                }
            case 12:
                DrawScope.m275e0((DrawScope) obj, this.f184463b, 0.0f, 0L, 0.0f, null, 126);
                return w2a1.f247311a;
            case 13:
                zvw0 zvw0Var = (zvw0) obj;
                zvw0Var.f286827m = Long.valueOf(this.f184463b);
                zvw0Var.f286835u = hvi0.m48881q();
                return w2a1.f247311a;
            case 14:
                zvw0 zvw0Var2 = (zvw0) obj;
                zvw0Var2.f286826l = Long.valueOf(this.f184463b);
                zvw0Var2.f286835u = hvi0.m48881q();
                return w2a1.f247311a;
            case 15:
                return z3p0.m95286b((z3p0) obj, 0L, null, Long.valueOf(this.f184463b), false, 0.0f, false, null, null, null, null, 0, false, false, 32759);
            case 16:
                DrawScope.m275e0((DrawScope) obj, this.f184463b, 0.0f, 0L, 0.0f, null, 126);
                return w2a1.f247311a;
            case 17:
                im91 im91VarM53259E = jg31.m53259E((int) this.f184463b, 0, null, 6);
                if (((rz11) ((lx4) obj).mo60167a()).f204033e.f287441a instanceof xy11) {
                    return new sxj(kbv.m55958d(im91VarM53259E, 2), whx.f251457c, 1.0f, null, 8);
                }
                return new sxj(pbv.f175910b, kbv.m55959e(im91VarM53259E, 2), -1.0f, null, 8);
            case 18:
                DrawScope.m275e0((DrawScope) obj, this.f184463b, 0.0f, 0L, 0.0f, null, 126);
                return w2a1.f247311a;
            case 19:
                DrawScope.m275e0((DrawScope) obj, this.f184463b, 0.0f, 0L, 0.0f, null, 126);
                return w2a1.f247311a;
            case 20:
                DrawScope drawScope3 = (DrawScope) obj;
                DrawScope.m275e0(drawScope3, this.f184463b, Size.m264e(drawScope3.mo295n()) / 2, 0L, 0.0f, qxy.f193763a, 108);
                return w2a1.f247311a;
            case 21:
                z0m z0mVar = (z0m) obj;
                if (z0mVar.f278138c > 0) {
                    long j3 = z0mVar.f278137b;
                    long j4 = z0mVar.f278139d;
                    long j5 = this.f184463b;
                    if (j5 >= j4 || j3 > j5) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 22:
                return new uk91(this.f184463b, ((Number) obj).longValue());
            case 23:
                Long l = (Long) obj;
                if (l == null) {
                    throw new IllegalStateException("Start the timer with startTimer before calling addTime");
                }
                long j6 = this.f184463b;
                if (cks.m33193l(j6)) {
                    return Long.valueOf(cks.m33187f(j6) + l.longValue());
                }
                throw new IllegalArgumentException("Cannot call addTime with a negative duration");
            case 24:
                t2b0 t2b0Var = ((rrq0) obj).f202103c;
                long jLongValue = Long.valueOf(t2b0Var.f195112a).longValue();
                long j7 = this.f184463b;
                if (j7 < jLongValue) {
                    i = 1;
                } else {
                    i = j7 > Long.valueOf(t2b0Var.f195113b).longValue() ? -1 : 0;
                }
                return Integer.valueOf(i);
            case 25:
                tgj tgjVar = (tgj) obj;
                tgjVar.mo50174s1();
                DrawScope.m277h0(tgjVar, this.f184463b, 0L, 0L, 0.7f, null, null, 118);
                return w2a1.f247311a;
            case 26:
                tgj tgjVar2 = (tgj) obj;
                tgjVar2.mo50174s1();
                DrawScope.m277h0(tgjVar2, this.f184463b, 0L, 0L, 0.7f, null, null, 118);
                return w2a1.f247311a;
            default:
                tgj tgjVar3 = (tgj) obj;
                tgjVar3.mo50174s1();
                DrawScope.m277h0(tgjVar3, this.f184463b, 0L, 0L, 0.7f, null, null, 118);
                return w2a1.f247311a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q22(long j, n5l0 n5l0Var, int i) {
        super(1);
        this.f184462a = i;
        this.f184463b = j;
    }
}
