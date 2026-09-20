package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zmw0 {

    /* JADX INFO: renamed from: a */
    public final String f284349a;

    /* JADX INFO: renamed from: b */
    public final String f284350b;

    /* JADX INFO: renamed from: c */
    public final List f284351c;

    public zmw0(String str, List list, String str2) {
        this.f284349a = str;
        this.f284350b = str2;
        this.f284351c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zmw0)) {
            return false;
        }
        zmw0 zmw0Var = (zmw0) obj;
        return wj50.m88271j(this.f284349a, zmw0Var.f284349a) && wj50.m88271j(this.f284350b, zmw0Var.f284350b) && wj50.m88271j(this.f284351c, zmw0Var.f284351c);
    }

    public final int hashCode() {
        return this.f284351c.hashCode() + s571.m77243b(this.f284349a.hashCode() * 31, 31, this.f284350b);
    }
}
