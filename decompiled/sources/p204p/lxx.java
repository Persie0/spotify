package p204p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class lxx {

    /* JADX INFO: renamed from: a */
    public final String f137908a;

    /* JADX INFO: renamed from: b */
    public final String f137909b;

    /* JADX INFO: renamed from: c */
    public final wwx f137910c;

    /* JADX INFO: renamed from: d */
    public final List f137911d;

    public lxx(String str, String str2, wwx wwxVar, List list) {
        this.f137908a = str;
        this.f137909b = str2;
        this.f137910c = wwxVar;
        this.f137911d = list;
    }

    /* JADX INFO: renamed from: a */
    public final jxx m60205a() {
        Object next;
        Iterator it = this.f137911d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((kxx) next) instanceof jxx));
        if (next instanceof jxx) {
            return (jxx) next;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxx)) {
            return false;
        }
        lxx lxxVar = (lxx) obj;
        return wj50.m88271j(this.f137908a, lxxVar.f137908a) && wj50.m88271j(this.f137909b, lxxVar.f137909b) && wj50.m88271j(this.f137910c, lxxVar.f137910c) && wj50.m88271j(this.f137911d, lxxVar.f137911d);
    }

    public final int hashCode() {
        String str = this.f137908a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f137909b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        wwx wwxVar = this.f137910c;
        return this.f137911d.hashCode() + ((iHashCode2 + (wwxVar != null ? wwxVar.hashCode() : 0)) * 31);
    }

    public /* synthetic */ lxx(int i, String str, String str2, List list) {
        this(str, (i & 2) != 0 ? null : str2, (wwx) null, (i & 8) != 0 ? lau.f131415a : list);
    }
}
