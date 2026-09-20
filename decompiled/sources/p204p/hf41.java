package p204p;

import android.net.Uri;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public abstract class hf41 {

    /* JADX INFO: renamed from: a */
    public static final gn80[] f90595a = {gn80.ALBUM};

    /* JADX INFO: renamed from: a */
    public static final String m47325a(String str) {
        Set set = dd41.f47702f;
        String strM35694A = r46.m74732a0(str, null).m35694A();
        return strM35694A == null ? edb.m38564m("spotify:user:", Uri.encode(str)) : strM35694A;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m47326b(String str) {
        Set set = dd41.f47702f;
        gn80[] gn80VarArr = f90595a;
        if (r46.m74709B(str, (gn80[]) Arrays.copyOf(gn80VarArr, gn80VarArr.length))) {
            return true;
        }
        return m47327c(str) && !str.equals("spotify:playlist:37i9dQZF1EYkqdzj48dyYq");
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m47327c(String str) {
        Set set = dd41.f47702f;
        return r46.m74712E(str, avp0.f20242e, ivp0.f106258f);
    }
}
