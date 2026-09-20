package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class fu20 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f73380a;

    /* JADX INFO: renamed from: b */
    public final e2r f73381b;

    /* JADX INFO: renamed from: c */
    public final String f73382c;

    /* JADX INFO: renamed from: d */
    public final String f73383d;

    public fu20(ArrayList arrayList, e2r e2rVar, String str, String str2) {
        this.f73380a = arrayList;
        this.f73381b = e2rVar;
        this.f73382c = str;
        this.f73383d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu20)) {
            return false;
        }
        fu20 fu20Var = (fu20) obj;
        return this.f73380a.equals(fu20Var.f73380a) && this.f73381b.equals(fu20Var.f73381b) && wj50.m88271j(this.f73382c, fu20Var.f73382c) && wj50.m88271j(this.f73383d, fu20Var.f73383d);
    }

    public final int hashCode() {
        return this.f73383d.hashCode() + s571.m77243b((this.f73381b.hashCode() + (this.f73380a.hashCode() * 31)) * 31, 31, this.f73382c);
    }
}
