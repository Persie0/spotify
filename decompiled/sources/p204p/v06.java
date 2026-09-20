package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v06 implements ktx {

    /* JADX INFO: renamed from: a */
    public final List f235924a;

    /* JADX INFO: renamed from: b */
    public final List f235925b;

    /* JADX INFO: renamed from: c */
    public final List f235926c;

    public v06(ae50 ae50Var, ae50 ae50Var2, ae50 ae50Var3) {
        this.f235924a = ae50Var;
        this.f235925b = ae50Var2;
        this.f235926c = ae50Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v06)) {
            return false;
        }
        v06 v06Var = (v06) obj;
        return wj50.m88271j(this.f235924a, v06Var.f235924a) && wj50.m88271j(this.f235925b, v06Var.f235925b) && wj50.m88271j(this.f235926c, v06Var.f235926c);
    }

    public final int hashCode() {
        return this.f235926c.hashCode() + s571.m77244c(this.f235924a.hashCode() * 31, 31, this.f235925b);
    }
}
