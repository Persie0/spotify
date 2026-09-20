package p204p;

import android.content.Context;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class d9k implements nx81 {

    /* JADX INFO: renamed from: a */
    public final Context f46849a;

    public /* synthetic */ d9k(Context context) {
        this.f46849a = context;
    }

    /* JADX INFO: renamed from: a */
    public List m35375a() {
        Context context = this.f46849a;
        try {
            return ci11.m32849k(context, 2);
        } catch (IllegalArgumentException unused) {
            ci11.m32859u(context);
            try {
                return ci11.m32849k(context, 2);
            } catch (IllegalArgumentException e) {
                na6.m63959g("Could not retrieve dynamic shortcuts", e);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m35376b(zh11 zh11Var) {
        List listM35375a = m35375a();
        Context context = this.f46849a;
        int iM32845g = ci11.m32845g(context);
        if (listM35375a != null) {
            int size = (listM35375a.size() - iM32845g) + 1;
            Integer numValueOf = Integer.valueOf(size);
            if (size <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                List listM43714b1 = g6f.m43714b1(g6f.m43711Y0(listM35375a, new fd11(1)), numValueOf.intValue());
                ArrayList arrayList = new ArrayList(i6f.m49804T(listM43714b1, 10));
                Iterator it = listM43714b1.iterator();
                while (it.hasNext()) {
                    arrayList.add(((zh11) it.next()).f282767b);
                }
                ci11.m32860v(context, arrayList);
            }
        }
        try {
            return ci11.m32855q(context, zh11Var);
        } catch (IllegalArgumentException e) {
            na6.m63959g("Could not push dynamic shortcut", e);
            return false;
        }
    }

    @Override // p204p.nx81
    /* JADX INFO: renamed from: h */
    public String mo30404h(String str, ebf0 ebf0Var) {
        return null;
    }

    @Override // p204p.nx81
    /* JADX INFO: renamed from: k */
    public Set mo30407k() {
        return bk5.m29624m1(new eww0[]{new eww0(v140.class), new eww0(erc1.class)});
    }

    @Override // p204p.nx81
    /* JADX INFO: renamed from: n */
    public pqm0 mo30413n(String str, ebf0 ebf0Var) {
        return new pqm0(null, lau.f131415a);
    }

    @Override // p204p.nx81
    /* JADX INFO: renamed from: o */
    public long mo30415o(String str, ebf0 ebf0Var) {
        return 0L;
    }

    @Override // p204p.nx81
    /* JADX INFO: renamed from: q */
    public String mo30419q(String str, ebf0 ebf0Var) {
        return this.f46849a.getString(R.string.sts_local_files_page_title);
    }

    @Override // p204p.nx81
    /* JADX INFO: renamed from: s */
    public String mo30423s(String str, ebf0 ebf0Var) {
        return null;
    }
}
