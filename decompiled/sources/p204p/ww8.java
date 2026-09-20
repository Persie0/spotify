package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ww8 {

    /* JADX INFO: renamed from: a */
    public int f255726a;

    /* JADX INFO: renamed from: b */
    public float f255727b;

    /* JADX INFO: renamed from: c */
    public final Object f255728c;

    public ww8(int i, boolean z) {
        this.f255726a = 0;
        this.f255728c = new float[i];
        this.f255727b = 1.0f;
    }

    /* JADX INFO: renamed from: a */
    public void m89174a(ax8 ax8Var) {
        ArrayList arrayList = ax8Var.f20797o;
        float size = arrayList.size() * 1.0f;
        float f = this.f255727b / 2.0f;
        for (int i = 0; i < size; i++) {
            bx8 bx8Var = (bx8) ((lyv) arrayList.get(i));
            if (bx8Var != null) {
                float f2 = bx8Var.f138121c;
                float f3 = bx8Var.f138119a;
                float f4 = f2 - f;
                float f5 = f2 + f;
                float f6 = f3 >= 0.0f ? f3 : 0.0f;
                if (f3 > 0.0f) {
                    f3 = 0.0f;
                }
                if (f6 > 0.0f) {
                    f6 *= 1.0f;
                } else {
                    f3 *= 1.0f;
                }
                float[] fArr = (float[]) this.f255728c;
                int i2 = this.f255726a;
                int i3 = i2 + 1;
                this.f255726a = i3;
                fArr[i2] = f4;
                int i4 = i2 + 2;
                this.f255726a = i4;
                fArr[i3] = f6;
                int i5 = i2 + 3;
                this.f255726a = i5;
                fArr[i4] = f5;
                this.f255726a = i2 + 4;
                fArr[i5] = f3;
            }
        }
        this.f255726a = 0;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX INFO: renamed from: b */
    public float m89175b(int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        bb71 bb71Var = (bb71) this.f255728c;
        int i2 = 1;
        if (z) {
            int iM65788x = nwg1.m65788x(bb71Var.f25459f, i, z);
            int lineStart = bb71Var.f25459f.getLineStart(iM65788x);
            int iM28621f = bb71Var.m28621f(iM65788x);
            if (i == lineStart || i == iM28621f) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        int i3 = i * 4;
        if (!z3) {
            i2 = z4 ? 2 : 3;
        } else if (z4) {
            i2 = 0;
        }
        int i4 = i3 + i2;
        if (this.f255726a == i4) {
            return this.f255727b;
        }
        float fM28623h = z3 ? bb71Var.m28623h(i, z) : bb71Var.m28624i(i, z);
        if (z2) {
            this.f255726a = i4;
            this.f255727b = fM28623h;
        }
        return fM28623h;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public Object m89176c(float f, ibk ibkVar) {
        p0w0 p0w0Var;
        if (ibkVar instanceof p0w0) {
            p0w0Var = (p0w0) ibkVar;
            int i = p0w0Var.f172825c;
            if ((i & Integer.MIN_VALUE) != 0) {
                p0w0Var.f172825c = i - Integer.MIN_VALUE;
            } else {
                p0w0Var = new p0w0(this, ibkVar);
            }
        } else {
            p0w0Var = new p0w0(this, ibkVar);
        }
        Object objInvoke = p0w0Var.f172823a;
        int i2 = p0w0Var.f172825c;
        if (i2 == 0) {
            bga.m29073P(objInvoke);
            zs71 zs71Var = (zs71) this.f255728c;
            Float f2 = new Float(f);
            p0w0Var.f172825c = 1;
            objInvoke = zs71Var.invoke(f2, p0w0Var);
            yuk yukVar = yuk.f276404a;
            if (objInvoke == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objInvoke);
        }
        this.f255727b += ((Number) objInvoke).floatValue();
        return w2a1.f247311a;
    }

    public ww8(int i, zs71 zs71Var) {
        this.f255726a = i;
        this.f255728c = zs71Var;
    }

    public ww8(bb71 bb71Var) {
        this.f255728c = bb71Var;
        this.f255726a = -1;
    }
}
