package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class hsy0 extends puy0 {

    /* JADX INFO: renamed from: a */
    public final List f94858a;

    /* JADX INFO: renamed from: b */
    public final String f94859b;

    /* JADX INFO: renamed from: c */
    public final boolean f94860c;

    public hsy0(String str, List list, boolean z) {
        this.f94858a = list;
        this.f94859b = str;
        this.f94860c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hsy0)) {
            return false;
        }
        hsy0 hsy0Var = (hsy0) obj;
        return this.f94858a.equals(hsy0Var.f94858a) && wj50.m88271j(this.f94859b, hsy0Var.f94859b) && this.f94860c == hsy0Var.f94860c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f94860c) + s571.m77243b(this.f94858a.hashCode() * 31, 961, this.f94859b);
    }
}
