package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class g271 {

    /* JADX INFO: renamed from: a */
    public final String f75861a;

    /* JADX INFO: renamed from: b */
    public final List f75862b;

    /* JADX INFO: renamed from: c */
    public final Long f75863c;

    public g271(String str, List list, Long l) {
        this.f75861a = str;
        this.f75862b = list;
        this.f75863c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g271)) {
            return false;
        }
        g271 g271Var = (g271) obj;
        return wj50.m88271j(this.f75861a, g271Var.f75861a) && wj50.m88271j(this.f75862b, g271Var.f75862b) && wj50.m88271j(this.f75863c, g271Var.f75863c);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(this.f75861a.hashCode() * 31, 31, this.f75862b);
        Long l = this.f75863c;
        return iM77244c + (l == null ? 0 : l.hashCode());
    }
}
