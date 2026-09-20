package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes7.dex */
public final class cq9 {

    /* JADX INFO: renamed from: a */
    public final z9j0 f40799a;

    public /* synthetic */ cq9(z9j0 z9j0Var) {
        this.f40799a = z9j0Var;
    }

    /* JADX INFO: renamed from: a */
    public void m33610a(String str, hz80 hz80Var, d850 d850Var) {
        Bundle bundleM36606f = dq60.m36606f("key_list_uri", str);
        if (hz80Var != null) {
            bundleM36606f.putParcelable("key_entity", hz80Var);
        }
        this.f40799a.mo47342b("spotify:internal:playlist-sorting", d850Var, bundleM36606f);
    }
}
