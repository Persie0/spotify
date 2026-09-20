package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class jpk implements kpk {

    /* JADX INFO: renamed from: a */
    public final ArrayList f114683a;

    /* JADX INFO: renamed from: b */
    public final String f114684b;

    /* JADX INFO: renamed from: c */
    public final String f114685c;

    public jpk(String str, String str2, ArrayList arrayList) {
        this.f114683a = arrayList;
        this.f114684b = str;
        this.f114685c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpk)) {
            return false;
        }
        jpk jpkVar = (jpk) obj;
        return this.f114683a.equals(jpkVar.f114683a) && wj50.m88271j(this.f114684b, jpkVar.f114684b) && wj50.m88271j(this.f114685c, jpkVar.f114685c);
    }

    public final int hashCode() {
        int iHashCode = this.f114683a.hashCode() * 31;
        String str = this.f114684b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f114685c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
