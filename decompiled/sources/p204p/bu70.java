package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class bu70 {

    /* JADX INFO: renamed from: a */
    public final gd70 f31044a;

    /* JADX INFO: renamed from: b */
    public final List f31045b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f31046c;

    /* JADX INFO: renamed from: d */
    public final List f31047d;

    public bu70(gd70 gd70Var, List list, ArrayList arrayList, List list2) {
        this.f31044a = gd70Var;
        this.f31045b = list;
        this.f31046c = arrayList;
        this.f31047d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu70)) {
            return false;
        }
        bu70 bu70Var = (bu70) obj;
        return this.f31044a.equals(bu70Var.f31044a) && this.f31045b.equals(bu70Var.f31045b) && this.f31046c.equals(bu70Var.f31046c) && this.f31047d.equals(bu70Var.f31047d);
    }

    public final int hashCode() {
        return this.f31047d.hashCode() + s571.m77245d(lq51.m59700f(this.f31046c, s571.m77244c(this.f31044a.hashCode() * 961, 31, this.f31045b), 31), 31, false);
    }

    public final String toString() {
        return "MethodSignatureData(returnType=" + this.f31044a + ", receiverType=null, valueParameters=" + this.f31045b + ", typeParameters=" + this.f31046c + ", hasStableParameterNames=false, errors=" + this.f31047d + ')';
    }
}
