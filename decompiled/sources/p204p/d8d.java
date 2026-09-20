package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class d8d implements lad {

    /* JADX INFO: renamed from: a */
    public final String f46425a;

    /* JADX INFO: renamed from: b */
    public final String f46426b;

    /* JADX INFO: renamed from: c */
    public final List f46427c;

    public d8d(String str, List list, String str2) {
        this.f46425a = str;
        this.f46426b = str2;
        this.f46427c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8d)) {
            return false;
        }
        d8d d8dVar = (d8d) obj;
        return wj50.m88271j(this.f46425a, d8dVar.f46425a) && wj50.m88271j(this.f46426b, d8dVar.f46426b) && wj50.m88271j(this.f46427c, d8dVar.f46427c);
    }

    public final int hashCode() {
        return this.f46427c.hashCode() + s571.m77243b(this.f46425a.hashCode() * 31, 31, this.f46426b);
    }
}
