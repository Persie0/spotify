package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class mi11 {

    /* JADX INFO: renamed from: a */
    public final String f143909a;

    /* JADX INFO: renamed from: b */
    public final un20 f143910b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f143911c;

    public mi11(String str, ArrayList arrayList, un20 un20Var) {
        this.f143909a = str;
        this.f143910b = un20Var;
        this.f143911c = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final String m61810a() {
        return this.f143909a;
    }

    /* JADX INFO: renamed from: b */
    public final List m61811b() {
        return this.f143911c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi11)) {
            return false;
        }
        mi11 mi11Var = (mi11) obj;
        return this.f143909a.equals(mi11Var.f143909a) && wj50.m88271j(this.f143910b, mi11Var.f143910b) && this.f143911c.equals(mi11Var.f143911c);
    }

    public final int hashCode() {
        int iHashCode = this.f143909a.hashCode() * 31;
        un20 un20Var = this.f143910b;
        return this.f143911c.hashCode() + ((iHashCode + (un20Var == null ? 0 : un20Var.hashCode())) * 31);
    }
}
