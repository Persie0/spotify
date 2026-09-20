package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class em41 {

    /* JADX INFO: renamed from: a */
    public final String f60820a;

    /* JADX INFO: renamed from: b */
    public final Object f60821b;

    public em41(String str, List list) {
        this.f60820a = str;
        this.f60821b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof em41)) {
            return false;
        }
        em41 em41Var = (em41) obj;
        return wj50.m88271j(this.f60820a, em41Var.f60820a) && this.f60821b.equals(em41Var.f60821b);
    }

    public final int hashCode() {
        return this.f60821b.hashCode() + (this.f60820a.hashCode() * 31);
    }
}
