package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class v00 implements i10 {

    /* JADX INFO: renamed from: a */
    public final boolean f235864a;

    /* JADX INFO: renamed from: b */
    public final tvi0 f235865b;

    /* JADX INFO: renamed from: c */
    public final List f235866c;

    public v00(List list, tvi0 tvi0Var, boolean z) {
        this.f235864a = z;
        this.f235865b = tvi0Var;
        this.f235866c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v00)) {
            return false;
        }
        v00 v00Var = (v00) obj;
        return this.f235864a == v00Var.f235864a && wj50.m88271j(this.f235865b, v00Var.f235865b) && wj50.m88271j(this.f235866c, v00Var.f235866c);
    }

    public final int hashCode() {
        return this.f235866c.hashCode() + ((this.f235865b.hashCode() + (Boolean.hashCode(this.f235864a) * 31)) * 31);
    }
}
