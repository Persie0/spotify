package p204p;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class woo {

    /* JADX INFO: renamed from: a */
    public final String f253521a;

    /* JADX INFO: renamed from: b */
    public final String f253522b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f253523c;

    /* JADX INFO: renamed from: d */
    public final Map f253524d;

    public woo(String str, String str2, Map map, ArrayList arrayList) {
        this.f253521a = str;
        this.f253522b = str2;
        this.f253523c = arrayList;
        this.f253524d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof woo)) {
            return false;
        }
        woo wooVar = (woo) obj;
        return wj50.m88271j(this.f253521a, wooVar.f253521a) && wj50.m88271j(this.f253522b, wooVar.f253522b) && this.f253523c.equals(wooVar.f253523c) && wj50.m88271j(this.f253524d, wooVar.f253524d);
    }

    public final int hashCode() {
        return this.f253524d.hashCode() + lq51.m59700f(this.f253523c, s571.m77243b(this.f253521a.hashCode() * 31, 31, this.f253522b), 31);
    }
}
