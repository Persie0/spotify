package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class jx41 {

    /* JADX INFO: renamed from: a */
    public final int f116800a;

    /* JADX INFO: renamed from: b */
    public final String f116801b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f116802c;

    public jx41(int i, String str, ArrayList arrayList) {
        this.f116800a = i;
        this.f116801b = str;
        this.f116802c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jx41)) {
            return false;
        }
        jx41 jx41Var = (jx41) obj;
        return this.f116800a == jx41Var.f116800a && this.f116801b.equals(jx41Var.f116801b) && this.f116802c.equals(jx41Var.f116802c);
    }

    public final int hashCode() {
        return this.f116802c.hashCode() + s571.m77243b(Integer.hashCode(this.f116800a) * 31, 31, this.f116801b);
    }
}
