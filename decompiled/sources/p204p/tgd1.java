package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class tgd1 {

    /* JADX INFO: renamed from: a */
    public final String f220173a;

    /* JADX INFO: renamed from: b */
    public final rzd1 f220174b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f220175c;

    public tgd1(String str, ArrayList arrayList, rzd1 rzd1Var) {
        this.f220173a = str;
        this.f220174b = rzd1Var;
        this.f220175c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tgd1)) {
            return false;
        }
        tgd1 tgd1Var = (tgd1) obj;
        return wj50.m88271j(this.f220173a, tgd1Var.f220173a) && this.f220174b.equals(tgd1Var.f220174b) && this.f220175c.equals(tgd1Var.f220175c);
    }

    public final int hashCode() {
        return ((this.f220175c.hashCode() + ((this.f220174b.hashCode() + (this.f220173a.hashCode() * 31)) * 31)) * 31) - 432188523;
    }
}
