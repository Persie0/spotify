package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class bhl implements chl {

    /* JADX INFO: renamed from: a */
    public final Object f27212a;

    /* JADX INFO: renamed from: b */
    public final fhl f27213b;

    /* JADX INFO: renamed from: c */
    public final boolean f27214c;

    public bhl(List list, fhl fhlVar, boolean z) {
        this.f27212a = list;
        this.f27213b = fhlVar;
        this.f27214c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhl)) {
            return false;
        }
        bhl bhlVar = (bhl) obj;
        return this.f27212a.equals(bhlVar.f27212a) && this.f27213b.equals(bhlVar.f27213b) && this.f27214c == bhlVar.f27214c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f27214c) + ((this.f27213b.hashCode() + (this.f27212a.hashCode() * 31)) * 31);
    }
}
