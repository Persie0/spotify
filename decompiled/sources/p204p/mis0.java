package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mis0 {

    /* JADX INFO: renamed from: a */
    public final List f144091a;

    /* JADX INFO: renamed from: b */
    public final List f144092b;

    /* JADX INFO: renamed from: c */
    public final List f144093c;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ mis0() {
        lau lauVar = lau.f131415a;
        this(lauVar, lauVar, lauVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mis0)) {
            return false;
        }
        mis0 mis0Var = (mis0) obj;
        return wj50.m88271j(this.f144091a, mis0Var.f144091a) && wj50.m88271j(this.f144092b, mis0Var.f144092b) && wj50.m88271j(this.f144093c, mis0Var.f144093c);
    }

    public final int hashCode() {
        return this.f144093c.hashCode() + s571.m77244c(this.f144091a.hashCode() * 31, 31, this.f144092b);
    }

    public mis0(List list, List list2, List list3) {
        this.f144091a = list;
        this.f144092b = list2;
        this.f144093c = list3;
    }
}
