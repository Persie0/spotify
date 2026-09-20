package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class p5z0 extends j6z0 {

    /* JADX INFO: renamed from: a */
    public final String f174258a;

    /* JADX INFO: renamed from: b */
    public final String f174259b;

    /* JADX INFO: renamed from: c */
    public final String f174260c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f174261d;

    public p5z0(String str, String str2, String str3, ArrayList arrayList) {
        this.f174258a = str;
        this.f174259b = str2;
        this.f174260c = str3;
        this.f174261d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5z0)) {
            return false;
        }
        p5z0 p5z0Var = (p5z0) obj;
        return wj50.m88271j(this.f174258a, p5z0Var.f174258a) && wj50.m88271j(this.f174259b, p5z0Var.f174259b) && wj50.m88271j(this.f174260c, p5z0Var.f174260c) && this.f174261d.equals(p5z0Var.f174261d);
    }

    public final int hashCode() {
        return this.f174261d.hashCode() + s571.m77243b(s571.m77243b(this.f174258a.hashCode() * 31, 31, this.f174259b), 31, this.f174260c);
    }
}
