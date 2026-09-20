package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class xk6 {

    /* JADX INFO: renamed from: a */
    public final am71 f262288a;

    /* JADX INFO: renamed from: b */
    public sr4 f262289b;

    public xk6(am71 am71Var) {
        this.f262288a = am71Var;
    }

    /* JADX INFO: renamed from: b */
    public static void m91264b(sr4 sr4Var, String str) {
        a410 a410Var;
        if (((sr4Var == null || (a410Var = (a410) sr4Var.m79017g().get(str)) == null) ? null : (Long) a410Var.f12113c) != null || sr4Var == null) {
            return;
        }
        sr4Var.m79016f(str);
    }

    /* JADX INFO: renamed from: c */
    public static String m91265c(String str, String str2) {
        return dq60.m36614n("[^a-zA-Z0-9]+", klh.m56834f(str, "_", str2), "_");
    }

    /* JADX INFO: renamed from: a */
    public final void m91266a(String str, long j, long j2, String str2) {
        sr4 sr4Var;
        a410 a410Var;
        String strM91265c = m91265c(str, str2);
        sr4 sr4Var2 = this.f262289b;
        if (((sr4Var2 == null || (a410Var = (a410) sr4Var2.m79017g().get(strM91265c)) == null) ? null : (Long) a410Var.f12113c) != null || (sr4Var = this.f262289b) == null) {
            return;
        }
        sr4.m79008c(sr4Var, strM91265c, j, j2, 16);
    }
}
