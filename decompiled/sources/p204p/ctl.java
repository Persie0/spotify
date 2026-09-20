package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ctl {

    /* JADX INFO: renamed from: a */
    public final String f41913a;

    /* JADX INFO: renamed from: b */
    public final String f41914b;

    /* JADX INFO: renamed from: c */
    public final Object f41915c;

    /* JADX INFO: renamed from: d */
    public final Object f41916d;

    public ctl(String str, String str2, List list, List list2) {
        this.f41913a = str;
        this.f41914b = str2;
        this.f41915c = list;
        this.f41916d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctl)) {
            return false;
        }
        ctl ctlVar = (ctl) obj;
        return this.f41913a.equals(ctlVar.f41913a) && wj50.m88271j(this.f41914b, ctlVar.f41914b) && this.f41915c.equals(ctlVar.f41915c) && this.f41916d.equals(ctlVar.f41916d);
    }

    public final int hashCode() {
        return this.f41916d.hashCode() + dq60.m36604d(s571.m77243b(this.f41913a.hashCode() * 31, 31, this.f41914b), 31, this.f41915c);
    }
}
