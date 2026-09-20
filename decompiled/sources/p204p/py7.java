package p204p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes2.dex */
public final class py7 {

    /* JADX INFO: renamed from: a */
    public final pnx0 f183361a;

    /* JADX INFO: renamed from: b */
    public final String f183362b;

    /* JADX INFO: renamed from: c */
    public final String f183363c;

    /* JADX INFO: renamed from: d */
    public final Single f183364d;

    public py7(pnx0 pnx0Var, String str, String str2, Single single) {
        this.f183361a = pnx0Var;
        if (str == null) {
            throw new NullPointerException("Null description");
        }
        this.f183362b = str;
        if (str2 == null) {
            throw new NullPointerException("Null factoryDescription");
        }
        this.f183363c = str2;
        this.f183364d = single;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof py7)) {
            return false;
        }
        py7 py7Var = (py7) obj;
        return this.f183361a.equals(py7Var.f183361a) && this.f183362b.equals(py7Var.f183362b) && this.f183363c.equals(py7Var.f183363c) && this.f183364d.equals(py7Var.f183364d);
    }

    public final int hashCode() {
        return ((((((this.f183361a.hashCode() ^ 1000003) * 1000003) ^ this.f183362b.hashCode()) * 1000003) ^ this.f183363c.hashCode()) * 1000003) ^ this.f183364d.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f183361a);
        return klh.m56837i(edb.m38573v("Command{input=", strValueOf, ", description=", this.f183362b, ", factoryDescription="), this.f183363c, ", asSingle=", String.valueOf(this.f183364d), "}");
    }
}
