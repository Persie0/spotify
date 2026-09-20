package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class li11 {

    /* JADX INFO: renamed from: a */
    public final String f133688a;

    /* JADX INFO: renamed from: b */
    public final List f133689b;

    public li11(String str, List list) {
        this.f133688a = str;
        this.f133689b = list;
    }

    /* JADX INFO: renamed from: a */
    public final String m59022a() {
        return this.f133688a;
    }

    /* JADX INFO: renamed from: b */
    public final List m59023b() {
        return this.f133689b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof li11)) {
            return false;
        }
        li11 li11Var = (li11) obj;
        return wj50.m88271j(this.f133688a, li11Var.f133688a) && wj50.m88271j(this.f133689b, li11Var.f133689b);
    }

    public final int hashCode() {
        return this.f133689b.hashCode() + (this.f133688a.hashCode() * 31);
    }
}
