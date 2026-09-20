package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i731 {

    /* JADX INFO: renamed from: a */
    public final List f99419a;

    /* JADX INFO: renamed from: b */
    public final String f99420b;

    /* JADX INFO: renamed from: c */
    public final String f99421c;

    public i731(String str, List list, String str2) {
        this.f99419a = list;
        this.f99420b = str;
        this.f99421c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i731)) {
            return false;
        }
        i731 i731Var = (i731) obj;
        return wj50.m88271j(this.f99419a, i731Var.f99419a) && wj50.m88271j(this.f99420b, i731Var.f99420b) && wj50.m88271j(this.f99421c, i731Var.f99421c);
    }

    public final int hashCode() {
        return this.f99421c.hashCode() + s571.m77243b(this.f99419a.hashCode() * 31, 31, this.f99420b);
    }
}
