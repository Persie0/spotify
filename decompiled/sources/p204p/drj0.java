package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class drj0 {

    /* JADX INFO: renamed from: a */
    public final String f52343a;

    /* JADX INFO: renamed from: b */
    public final String f52344b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f52345c;

    /* JADX INFO: renamed from: d */
    public final boolean f52346d;

    /* JADX INFO: renamed from: e */
    public final fdk f52347e;

    /* JADX INFO: renamed from: f */
    public final boolean f52348f;

    public drj0(String str, String str2, ArrayList arrayList, boolean z, fdk fdkVar, boolean z2) {
        this.f52343a = str;
        this.f52344b = str2;
        this.f52345c = arrayList;
        this.f52346d = z;
        this.f52347e = fdkVar;
        this.f52348f = z2;
    }

    /* JADX INFO: renamed from: a */
    public static drj0 m36733a(drj0 drj0Var, boolean z) {
        String str = drj0Var.f52343a;
        String str2 = drj0Var.f52344b;
        ArrayList arrayList = drj0Var.f52345c;
        boolean z2 = drj0Var.f52346d;
        fdk fdkVar = drj0Var.f52347e;
        drj0Var.getClass();
        return new drj0(str, str2, arrayList, z2, fdkVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drj0)) {
            return false;
        }
        drj0 drj0Var = (drj0) obj;
        return wj50.m88271j(this.f52343a, drj0Var.f52343a) && wj50.m88271j(this.f52344b, drj0Var.f52344b) && this.f52345c.equals(drj0Var.f52345c) && this.f52346d == drj0Var.f52346d && wj50.m88271j(this.f52347e, drj0Var.f52347e) && this.f52348f == drj0Var.f52348f;
    }

    public final int hashCode() {
        int iHashCode = this.f52343a.hashCode() * 31;
        String str = this.f52344b;
        int iM77245d = s571.m77245d(lq51.m59700f(this.f52345c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.f52346d);
        fdk fdkVar = this.f52347e;
        return Boolean.hashCode(this.f52348f) + ((iM77245d + (fdkVar != null ? fdkVar.hashCode() : 0)) * 31);
    }
}
