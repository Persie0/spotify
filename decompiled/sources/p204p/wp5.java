package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wp5 {

    /* JADX INFO: renamed from: a */
    public final String f253676a;

    /* JADX INFO: renamed from: b */
    public final String f253677b;

    /* JADX INFO: renamed from: c */
    public final List f253678c;

    public wp5(String str, List list, String str2) {
        this.f253676a = str;
        this.f253677b = str2;
        this.f253678c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp5)) {
            return false;
        }
        wp5 wp5Var = (wp5) obj;
        return wj50.m88271j(this.f253676a, wp5Var.f253676a) && wj50.m88271j(this.f253677b, wp5Var.f253677b) && wj50.m88271j(this.f253678c, wp5Var.f253678c);
    }

    public final int hashCode() {
        return this.f253678c.hashCode() + s571.m77243b(this.f253676a.hashCode() * 31, 31, this.f253677b);
    }
}
