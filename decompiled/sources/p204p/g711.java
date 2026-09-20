package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class g711 implements h711 {

    /* JADX INFO: renamed from: a */
    public final List f77155a;

    /* JADX INFO: renamed from: b */
    public final boolean f77156b;

    /* JADX INFO: renamed from: c */
    public final boolean f77157c;

    public g711(ArrayList arrayList, boolean z, boolean z2) {
        this.f77155a = arrayList;
        this.f77156b = z;
        this.f77157c = z2;
    }

    @Override // p204p.h711
    /* JADX INFO: renamed from: a */
    public final boolean mo40946a() {
        return this.f77157c;
    }

    @Override // p204p.h711
    /* JADX INFO: renamed from: b */
    public final boolean mo40947b() {
        return this.f77156b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g711)) {
            return false;
        }
        g711 g711Var = (g711) obj;
        return wj50.m88271j(this.f77155a, g711Var.f77155a) && this.f77156b == g711Var.f77156b && this.f77157c == g711Var.f77157c;
    }

    public final int hashCode() {
        List list = this.f77155a;
        return Boolean.hashCode(this.f77157c) + s571.m77245d((list == null ? 0 : list.hashCode()) * 31, 31, this.f77156b);
    }
}
