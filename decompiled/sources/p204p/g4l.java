package p204p;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class g4l {

    /* JADX INFO: renamed from: a */
    public static final Charset f76438a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public abstract ty7 mo43536a();

    /* JADX INFO: renamed from: b */
    public final uy7 m43537b(long j, String str, boolean z) {
        ty7 ty7VarMo43536a = mo43536a();
        f4l f4lVar = ((uy7) this).f235200k;
        if (f4lVar != null) {
            fz7 fz7VarMo40735a = f4lVar.mo40735a();
            fz7VarMo40735a.f74928e = Long.valueOf(j);
            fz7VarMo40735a.f74929f = z;
            fz7VarMo40735a.f74936m = (byte) (fz7VarMo40735a.f74936m | 2);
            if (str != null) {
                m08 m08Var = new m08();
                m08Var.m60422c(str);
                fz7VarMo40735a.f74931h = m08Var.m60420a();
            }
            ty7VarMo43536a.f224865j = fz7VarMo40735a.m43171a();
        }
        return ty7VarMo43536a.m81948a();
    }
}
