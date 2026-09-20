package p204p;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class mys {

    /* JADX INFO: renamed from: a */
    public final z9j0 f148506a;

    public mys(z9j0 z9j0Var) {
        this.f148506a = z9j0Var;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m63205b(mys mysVar, String str, d850 d850Var, Set set, i490 i490Var, int i) {
        if ((i & 4) != 0) {
            set = gbu.f78413a;
        }
        mysVar.m63208a(str, d850Var, set, oso.f168842a, i490Var);
    }

    /* JADX INFO: renamed from: c */
    public static String m63206c(String str) {
        Set set = dd41.f47702f;
        String strM35694A = r46.m74726U("spotify:internal:playlist-edit-items:".concat(r46.m74726U(str).m35710h())).m35694A();
        if (strM35694A != null) {
            return strM35694A;
        }
        throw new IllegalArgumentException("Failed to create target URI for playlist edit items page");
    }

    /* JADX INFO: renamed from: d */
    public static String m63207d(String str) {
        Set set = dd41.f47702f;
        String strM35694A = r46.m74726U("spotify:internal:playlist-edit-metadata:".concat(r46.m74726U(str).m35710h())).m35694A();
        if (strM35694A != null) {
            return strM35694A;
        }
        throw new IllegalArgumentException("Failed to create target URI for playlist edit metadata page");
    }

    /* JADX INFO: renamed from: a */
    public final void m63208a(String str, d850 d850Var, Set set, qso qsoVar, i490 i490Var) {
        String strM63206c = m63206c(str);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("filters", new ArrayList<>(set));
        bundle.putParcelable("deep_link", qsoVar);
        bundle.putParcelable("list-sort-order", i490Var);
        this.f148506a.mo47342b(strM63206c, d850Var, bundle);
    }
}
