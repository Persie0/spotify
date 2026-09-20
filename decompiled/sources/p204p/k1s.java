package p204p;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public final class k1s implements t3b1 {

    /* JADX INFO: renamed from: a */
    public static final k1s f118418a = new k1s();

    /* JADX INFO: renamed from: b */
    public static final po10 f118419b = po10.m70454i("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // p204p.t3b1
    /* JADX INFO: renamed from: f */
    public final Object mo41272f(yl60 yl60Var, float f) {
        yl60Var.mo53760c();
        String strMo53767o = null;
        float fMo53765k = 0.0f;
        float fMo53765k2 = 0.0f;
        float fMo53765k3 = 0.0f;
        float fMo53765k4 = 0.0f;
        int iMo53766n = 0;
        int iM62268a = 0;
        int iM62268a2 = 0;
        boolean zMo53764i = true;
        int i = 3;
        String strMo53767o2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (yl60Var.mo53763h()) {
            switch (yl60Var.mo53769s(f118419b)) {
                case 0:
                    strMo53767o = yl60Var.mo53767o();
                    break;
                case 1:
                    strMo53767o2 = yl60Var.mo53767o();
                    break;
                case 2:
                    fMo53765k = (float) yl60Var.mo53765k();
                    pointF = pointF;
                    break;
                case 3:
                    PointF pointF3 = pointF;
                    int iMo53766n2 = yl60Var.mo53766n();
                    i = (iMo53766n2 > 2 || iMo53766n2 < 0) ? 3 : edb.m38551G(3)[iMo53766n2];
                    pointF = pointF3;
                    pointF2 = pointF2;
                    break;
                case 4:
                    iMo53766n = yl60Var.mo53766n();
                    break;
                case 5:
                    fMo53765k2 = (float) yl60Var.mo53765k();
                    pointF = pointF;
                    break;
                case 6:
                    fMo53765k3 = (float) yl60Var.mo53765k();
                    pointF = pointF;
                    break;
                case 7:
                    iM62268a = mm60.m62268a(yl60Var);
                    break;
                case 8:
                    iM62268a2 = mm60.m62268a(yl60Var);
                    break;
                case 9:
                    fMo53765k4 = (float) yl60Var.mo53765k();
                    pointF = pointF;
                    break;
                case 10:
                    zMo53764i = yl60Var.mo53764i();
                    break;
                case 11:
                    yl60Var.mo53759a();
                    PointF pointF4 = new PointF(((float) yl60Var.mo53765k()) * f, ((float) yl60Var.mo53765k()) * f);
                    yl60Var.mo53761e();
                    pointF = pointF4;
                    pointF2 = pointF2;
                    break;
                case 12:
                    yl60Var.mo53759a();
                    pointF2 = new PointF(((float) yl60Var.mo53765k()) * f, ((float) yl60Var.mo53765k()) * f);
                    yl60Var.mo53761e();
                    pointF = pointF;
                    break;
                default:
                    yl60Var.mo53770t();
                    yl60Var.mo53771x();
                    break;
            }
        }
        yl60Var.mo53762f();
        j1s j1sVar = new j1s();
        j1sVar.f107827a = strMo53767o;
        j1sVar.f107828b = strMo53767o2;
        j1sVar.f107829c = fMo53765k;
        j1sVar.f107830d = i;
        j1sVar.f107831e = iMo53766n;
        j1sVar.f107832f = fMo53765k2;
        j1sVar.f107833g = fMo53765k3;
        j1sVar.f107834h = iM62268a;
        j1sVar.f107835i = iM62268a2;
        j1sVar.f107836j = fMo53765k4;
        j1sVar.f107837k = zMo53764i;
        j1sVar.f107838l = pointF;
        j1sVar.f107839m = pointF2;
        return j1sVar;
    }
}
