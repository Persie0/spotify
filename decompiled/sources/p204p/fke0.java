package p204p;

import java.io.EOFException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fke0 {

    /* JADX INFO: renamed from: a */
    public static final po10 f70531a = po10.m70454i("nm", "mm", "hd");

    /* JADX INFO: renamed from: a */
    public static dke0 m41918a(jm60 jm60Var) throws el60, EOFException {
        int i = 0;
        String strMo53767o = null;
        boolean zMo53764i = false;
        while (jm60Var.mo53763h()) {
            int iMo53769s = jm60Var.mo53769s(f70531a);
            if (iMo53769s == 0) {
                strMo53767o = jm60Var.mo53767o();
            } else if (iMo53769s == 1) {
                int iMo53766n = jm60Var.mo53766n();
                if (iMo53766n != 1) {
                    if (iMo53766n != 2) {
                        int i2 = 3;
                        if (iMo53766n != 3) {
                            i2 = 4;
                            if (iMo53766n != 4) {
                                i2 = 5;
                                if (iMo53766n != 5) {
                                }
                            }
                        }
                        i = i2;
                    } else {
                        i = 2;
                    }
                }
                i = 1;
            } else if (iMo53769s != 2) {
                jm60Var.mo53770t();
                jm60Var.mo53771x();
            } else {
                zMo53764i = jm60Var.mo53764i();
            }
        }
        return new dke0(strMo53767o, i, zMo53764i);
    }
}
