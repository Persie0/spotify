package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class oyx {

    /* JADX INFO: renamed from: a */
    public final List f171909a;

    /* JADX INFO: renamed from: b */
    public final pyx f171910b;

    /* JADX INFO: renamed from: c */
    public final String f171911c;

    public oyx(List list, pyx pyxVar, String str) {
        this.f171909a = list;
        this.f171910b = pyxVar;
        this.f171911c = str;
    }

    /* JADX INFO: renamed from: a */
    public static oyx m68566a(oyx oyxVar, ArrayList arrayList) {
        pyx pyxVar = oyxVar.f171910b;
        String str = oyxVar.f171911c;
        oyxVar.getClass();
        return new oyx(arrayList, pyxVar, str);
    }

    /* JADX INFO: renamed from: b */
    public final List m68567b() {
        return this.f171909a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oyx)) {
            return false;
        }
        oyx oyxVar = (oyx) obj;
        return wj50.m88271j(this.f171909a, oyxVar.f171909a) && this.f171910b == oyxVar.f171910b && wj50.m88271j(this.f171911c, oyxVar.f171911c);
    }

    public final int hashCode() {
        int iHashCode = this.f171909a.hashCode() * 31;
        pyx pyxVar = this.f171910b;
        int iHashCode2 = (iHashCode + (pyxVar == null ? 0 : pyxVar.hashCode())) * 31;
        String str = this.f171911c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
