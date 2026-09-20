package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class mql {

    /* JADX INFO: renamed from: a */
    public final String f146307a;

    /* JADX INFO: renamed from: b */
    public final String f146308b;

    /* JADX INFO: renamed from: c */
    public final List f146309c;

    /* JADX INFO: renamed from: d */
    public final boolean f146310d;

    public mql(String str, String str2, List list, boolean z) {
        this.f146307a = str;
        this.f146308b = str2;
        this.f146309c = list;
        this.f146310d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mql)) {
            return false;
        }
        mql mqlVar = (mql) obj;
        return wj50.m88271j(this.f146307a, mqlVar.f146307a) && wj50.m88271j(this.f146308b, mqlVar.f146308b) && wj50.m88271j(this.f146309c, mqlVar.f146309c) && this.f146310d == mqlVar.f146310d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f146310d) + s571.m77244c(s571.m77243b(this.f146307a.hashCode() * 31, 31, this.f146308b), 31, this.f146309c);
    }
}
