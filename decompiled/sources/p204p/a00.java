package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class a00 implements i10 {

    /* JADX INFO: renamed from: a */
    public final tvi0 f10969a;

    /* JADX INFO: renamed from: b */
    public final List f10970b;

    /* JADX INFO: renamed from: c */
    public final boolean f10971c;

    public a00(List list, tvi0 tvi0Var, boolean z) {
        this.f10969a = tvi0Var;
        this.f10970b = list;
        this.f10971c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a00)) {
            return false;
        }
        a00 a00Var = (a00) obj;
        return wj50.m88271j(this.f10969a, a00Var.f10969a) && wj50.m88271j(this.f10970b, a00Var.f10970b) && this.f10971c == a00Var.f10971c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10971c) + s571.m77244c(this.f10969a.hashCode() * 31, 31, this.f10970b);
    }
}
