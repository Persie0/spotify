package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class o881 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f162733a;

    /* JADX INFO: renamed from: b */
    public final String f162734b;

    /* JADX INFO: renamed from: c */
    public final String f162735c;

    /* JADX INFO: renamed from: d */
    public final String f162736d;

    public o881(String str, String str2, String str3, ArrayList arrayList) {
        this.f162733a = arrayList;
        this.f162734b = str;
        this.f162735c = str2;
        this.f162736d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o881)) {
            return false;
        }
        o881 o881Var = (o881) obj;
        return this.f162733a.equals(o881Var.f162733a) && wj50.m88271j(this.f162734b, o881Var.f162734b) && wj50.m88271j(this.f162735c, o881Var.f162735c) && wj50.m88271j(this.f162736d, o881Var.f162736d);
    }

    public final int hashCode() {
        return this.f162736d.hashCode() + s571.m77243b(s571.m77243b(this.f162733a.hashCode() * 31, 31, this.f162734b), 31, this.f162735c);
    }
}
