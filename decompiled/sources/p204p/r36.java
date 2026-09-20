package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public final class r36 {

    /* JADX INFO: renamed from: a */
    public final z9j0 f195429a;

    public /* synthetic */ r36(z9j0 z9j0Var) {
        this.f195429a = z9j0Var;
    }

    /* JADX INFO: renamed from: a */
    public void m74619a(String str, d850 d850Var) {
        String strM77252k = s571.m77252k(xoc1.f264061c6.f243453a, "?uri=", Uri.encode(str), "&config=edit");
        z9j0 z9j0Var = this.f195429a;
        if (d850Var != null) {
            z9j0Var.mo47342b(strM77252k, d850Var, null);
        } else {
            z9j0Var.mo47346g(strM77252k);
        }
    }
}
