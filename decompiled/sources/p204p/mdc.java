package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class mdc {

    /* JADX INFO: renamed from: a */
    public final String f142372a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f142373b;

    /* JADX INFO: renamed from: c */
    public final List f142374c;

    public mdc(String str, ArrayList arrayList, List list) {
        this.f142372a = str;
        this.f142373b = arrayList;
        this.f142374c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mdc)) {
            return false;
        }
        mdc mdcVar = (mdc) obj;
        return this.f142372a.equals(mdcVar.f142372a) && this.f142373b.equals(mdcVar.f142373b) && wj50.m88271j(this.f142374c, mdcVar.f142374c);
    }

    public final int hashCode() {
        return this.f142374c.hashCode() + lq51.m59700f(this.f142373b, this.f142372a.hashCode() * 31, 31);
    }
}
