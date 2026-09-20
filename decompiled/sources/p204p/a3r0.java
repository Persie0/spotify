package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class a3r0 implements f3r0 {

    /* JADX INFO: renamed from: a */
    public final String f12031a;

    /* JADX INFO: renamed from: b */
    public final String f12032b;

    /* JADX INFO: renamed from: c */
    public final List f12033c;

    public a3r0(String str, String str2, ae50 ae50Var) {
        this.f12031a = str;
        this.f12032b = str2;
        this.f12033c = ae50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3r0)) {
            return false;
        }
        a3r0 a3r0Var = (a3r0) obj;
        return wj50.m88271j(this.f12031a, a3r0Var.f12031a) && wj50.m88271j(this.f12032b, a3r0Var.f12032b) && wj50.m88271j(this.f12033c, a3r0Var.f12033c);
    }

    public final int hashCode() {
        return this.f12033c.hashCode() + s571.m77243b(this.f12031a.hashCode() * 31, 31, this.f12032b);
    }
}
