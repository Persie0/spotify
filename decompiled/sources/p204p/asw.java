package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class asw implements k3x {

    /* JADX INFO: renamed from: a */
    public final String f19519a;

    /* JADX INFO: renamed from: b */
    public final String f19520b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f19521c;

    public asw(String str, String str2, ArrayList arrayList) {
        this.f19519a = str;
        this.f19520b = str2;
        this.f19521c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asw)) {
            return false;
        }
        asw aswVar = (asw) obj;
        return wj50.m88271j(this.f19519a, aswVar.f19519a) && wj50.m88271j(this.f19520b, aswVar.f19520b) && this.f19521c.equals(aswVar.f19521c);
    }

    public final int hashCode() {
        return this.f19521c.hashCode() + s571.m77243b(this.f19519a.hashCode() * 31, 31, this.f19520b);
    }
}
