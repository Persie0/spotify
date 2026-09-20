package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jw2 {

    /* JADX INFO: renamed from: a */
    public final String f116558a;

    /* JADX INFO: renamed from: b */
    public final String f116559b;

    /* JADX INFO: renamed from: c */
    public final List f116560c;

    public jw2(String str, List list, String str2) {
        this.f116558a = str;
        this.f116559b = str2;
        this.f116560c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw2)) {
            return false;
        }
        jw2 jw2Var = (jw2) obj;
        return wj50.m88271j(this.f116558a, jw2Var.f116558a) && wj50.m88271j(this.f116559b, jw2Var.f116559b) && wj50.m88271j(this.f116560c, jw2Var.f116560c);
    }

    public final int hashCode() {
        return this.f116560c.hashCode() + s571.m77243b(this.f116558a.hashCode() * 31, 31, this.f116559b);
    }
}
