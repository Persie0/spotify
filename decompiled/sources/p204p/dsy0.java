package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class dsy0 {

    /* JADX INFO: renamed from: a */
    public final String f52674a;

    /* JADX INFO: renamed from: b */
    public final List f52675b;

    public dsy0(String str, List list) {
        this.f52674a = str;
        this.f52675b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsy0)) {
            return false;
        }
        dsy0 dsy0Var = (dsy0) obj;
        return wj50.m88271j(this.f52674a, dsy0Var.f52674a) && wj50.m88271j(this.f52675b, dsy0Var.f52675b);
    }

    public final int hashCode() {
        return this.f52675b.hashCode() + (this.f52674a.hashCode() * 31);
    }
}
