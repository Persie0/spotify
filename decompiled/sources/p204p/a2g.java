package p204p;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: classes3.dex */
public final class a2g implements vh00 {

    /* JADX INFO: renamed from: b */
    public static final a2g f11660b = new a2g(0);

    /* JADX INFO: renamed from: c */
    public static final a2g f11661c = new a2g(1);

    /* JADX INFO: renamed from: d */
    public static final a2g f11662d = new a2g(2);

    /* JADX INFO: renamed from: e */
    public static final a2g f11663e = new a2g(3);

    /* JADX INFO: renamed from: f */
    public static final a2g f11664f = new a2g(4);

    /* JADX INFO: renamed from: g */
    public static final a2g f11665g = new a2g(5);

    /* JADX INFO: renamed from: h */
    public static final a2g f11666h = new a2g(6);

    /* JADX INFO: renamed from: i */
    public static final a2g f11667i = new a2g(7);

    /* JADX INFO: renamed from: t */
    public static final a2g f11668t = new a2g(8);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11669a;

    public /* synthetic */ a2g(int i) {
        this.f11669a = i;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        int i = this.f11669a;
        w2a1 w2a1Var = w2a1.f247311a;
        switch (i) {
            case 0:
                xq00 xq00Var = (xq00) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if (!xq00Var.m91752Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    xq00Var.m91757b0();
                }
                return w2a1Var;
            case 1:
                xq00 xq00Var2 = (xq00) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if (!xq00Var2.m91752Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    xq00Var2.m91757b0();
                }
                return w2a1Var;
            case 2:
                xq00 xq00Var3 = (xq00) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if (!xq00Var3.m91752Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    xq00Var3.m91757b0();
                }
                return w2a1Var;
            case 3:
                d731 d731Var = (d731) obj;
                xq00 xq00Var4 = (xq00) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= xq00Var4.m91766g(d731Var) ? 4 : 2;
                }
                if (xq00Var4.m91752Y(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    rkk.m75753e(d731Var, null, null, xq00Var4, iIntValue4 & 14, 6);
                } else {
                    xq00Var4.m91757b0();
                }
                return w2a1Var;
            case 4:
                y631 y631Var = (y631) obj;
                xq00 xq00Var5 = (xq00) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= xq00Var5.m91766g(y631Var) ? 4 : 2;
                }
                if (xq00Var5.m91752Y(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    g831.m43943c(y631Var, null, null, 0L, 0L, 0L, 0L, 0L, xq00Var5, iIntValue5 & 14);
                } else {
                    xq00Var5.m91757b0();
                }
                return w2a1Var;
            case 6:
                DrawScope drawScope = (DrawScope) obj;
                long j = ((Offset) obj2).f493a;
                long j2 = ((n6f) obj3).f150873a;
                dr21 dr21Var = dr21.f52154a;
                DrawScope.m275e0(drawScope, j2, drawScope.mo35989Z0(dr21.f52156c) / 2.0f, j, 0.0f, null, 120);
            case 5:
                return w2a1Var;
            case 7:
                return w2a1Var;
            default:
                return w2a1Var;
        }
    }
}
