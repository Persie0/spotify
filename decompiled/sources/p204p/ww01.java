package p204p;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ww01 {

    /* JADX INFO: renamed from: a */
    public final Context f255657a;

    /* JADX INFO: renamed from: b */
    public final String f255658b;

    /* JADX INFO: renamed from: c */
    public final m811 f255659c;

    /* JADX INFO: renamed from: d */
    public final m811 f255660d;

    /* JADX INFO: renamed from: e */
    public final List f255661e;

    public ww01(Context context, String str, m811 m811Var, m811 m811Var2, List list) {
        this.f255657a = context;
        this.f255658b = str;
        this.f255659c = m811Var;
        this.f255660d = m811Var2;
        this.f255661e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ww01)) {
            return false;
        }
        ww01 ww01Var = (ww01) obj;
        return wj50.m88271j(this.f255657a, ww01Var.f255657a) && wj50.m88271j(this.f255658b, ww01Var.f255658b) && wj50.m88271j(this.f255659c, ww01Var.f255659c) && wj50.m88271j(this.f255660d, ww01Var.f255660d) && wj50.m88271j(this.f255661e, ww01Var.f255661e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f255657a.hashCode() * 31, 31, this.f255658b);
        m811 m811Var = this.f255659c;
        int iHashCode = (iM77243b + (m811Var == null ? 0 : m811Var.hashCode())) * 31;
        m811 m811Var2 = this.f255660d;
        return this.f255661e.hashCode() + ((iHashCode + (m811Var2 != null ? m811Var2.hashCode() : 0)) * 31);
    }

    public /* synthetic */ ww01(Context context, String str, m811 m811Var, m811 m811Var2, List list, int i) {
        this(context, str, m811Var, (i & 8) != 0 ? null : m811Var2, (i & 16) != 0 ? lau.f131415a : list);
    }
}
