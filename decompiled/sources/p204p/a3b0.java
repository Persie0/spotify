package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a3b0 implements yqq {

    /* JADX INFO: renamed from: a */
    public boolean f11910a;

    /* JADX INFO: renamed from: b */
    public long f11911b = 9223372034707292159L;

    /* JADX INFO: renamed from: c */
    public long f11912c = 0;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ d3b0 f11913d;

    public a3b0(d3b0 d3b0Var) {
        this.f11913d = d3b0Var;
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: W0 */
    public final float mo24617W0() {
        return this.f11913d.mo24617W0();
    }

    /* JADX WARN: Type inference failed for: r3v14, types: [byte[], java.io.Serializable] */
    /* JADX INFO: renamed from: a */
    public final void m24618a(dux0 dux0Var, float f) {
        d3b0 d3b0Var = this.f11913d;
        bg30 bg30Var = d3b0Var.f44839Z;
        if (bg30Var == null) {
            bg30Var = new bg30();
            d3b0Var.f44839Z = bg30Var;
        }
        int iM29589L0 = bk5.m29589L0((dux0[]) bg30Var.f26821b, dux0Var);
        if (iM29589L0 >= 0) {
            float[] fArr = (float[]) bg30Var.f26822c;
            if (fArr[iM29589L0] != f) {
                fArr[iM29589L0] = f;
                ((byte[]) bg30Var.f26823d)[iM29589L0] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) bg30Var.f26823d;
                if (bArr[iM29589L0] == 2) {
                    bArr[iM29589L0] = 0;
                    return;
                }
                return;
            }
        }
        int i = bg30Var.f26820a;
        dux0[] dux0VarArr = (dux0[]) bg30Var.f26821b;
        if (i == dux0VarArr.length) {
            int i2 = i * 2;
            bg30Var.f26821b = (dux0[]) Arrays.copyOf(dux0VarArr, i2);
            bg30Var.f26822c = Arrays.copyOf((float[]) bg30Var.f26822c, i2);
            bg30Var.f26823d = Arrays.copyOf((byte[]) bg30Var.f26823d, i2);
        }
        ((dux0[]) bg30Var.f26821b)[i] = dux0Var;
        ((byte[]) bg30Var.f26823d)[i] = 3;
        ((float[]) bg30Var.f26822c)[i] = f;
        bg30Var.f26820a++;
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: j */
    public final float mo24619j() {
        return this.f11913d.mo24619j();
    }
}
