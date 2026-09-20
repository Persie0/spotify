package p204p;

import java.io.EOFException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mzz {

    /* JADX INFO: renamed from: a */
    public static final po10 f148838a = po10.m70454i("fFamily", "fName", "fStyle", "ascent");

    /* JADX INFO: renamed from: a */
    public static bzz m63272a(jm60 jm60Var) throws el60, EOFException {
        jm60Var.mo53760c();
        String strMo53767o = null;
        String strMo53767o2 = null;
        String strMo53767o3 = null;
        while (jm60Var.mo53763h()) {
            int iMo53769s = jm60Var.mo53769s(f148838a);
            if (iMo53769s == 0) {
                strMo53767o = jm60Var.mo53767o();
            } else if (iMo53769s == 1) {
                strMo53767o2 = jm60Var.mo53767o();
            } else if (iMo53769s == 2) {
                strMo53767o3 = jm60Var.mo53767o();
            } else if (iMo53769s != 3) {
                jm60Var.mo53770t();
                jm60Var.mo53771x();
            } else {
                jm60Var.mo53765k();
            }
        }
        jm60Var.mo53762f();
        return new bzz(strMo53767o, strMo53767o2, strMo53767o3);
    }
}
