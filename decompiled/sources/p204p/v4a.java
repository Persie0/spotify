package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class v4a extends w4a {

    /* JADX INFO: renamed from: a */
    public final int f237099a;

    /* JADX INFO: renamed from: b */
    public final String f237100b;

    /* JADX INFO: renamed from: c */
    public final String f237101c;

    /* JADX INFO: renamed from: d */
    public final List f237102d;

    public v4a(int i, String str, String str2, List list) {
        this.f237099a = i;
        this.f237100b = str;
        this.f237101c = str2;
        this.f237102d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4a)) {
            return false;
        }
        v4a v4aVar = (v4a) obj;
        return this.f237099a == v4aVar.f237099a && this.f237100b.equals(v4aVar.f237100b) && wj50.m88271j(this.f237101c, v4aVar.f237101c) && this.f237102d.equals(v4aVar.f237102d);
    }

    public final int hashCode() {
        return this.f237102d.hashCode() + s571.m77243b(s571.m77243b(edb.m38547C(this.f237099a) * 31, 31, this.f237100b), 31, this.f237101c);
    }
}
