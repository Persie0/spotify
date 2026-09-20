package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class npc implements kwh0 {

    /* JADX INFO: renamed from: a */
    public final String f156928a;

    /* JADX INFO: renamed from: b */
    public final int f156929b;

    /* JADX INFO: renamed from: c */
    public final String f156930c;

    /* JADX INFO: renamed from: d */
    public final String f156931d;

    /* JADX INFO: renamed from: e */
    public final String f156932e;

    /* JADX INFO: renamed from: f */
    public final List f156933f;

    /* JADX INFO: renamed from: g */
    public final boolean f156934g;

    public npc(int i, String str, String str2, String str3, String str4, List list, boolean z) {
        this.f156928a = str;
        this.f156929b = i;
        this.f156930c = str2;
        this.f156931d = str3;
        this.f156932e = str4;
        this.f156933f = list;
        this.f156934g = z;
    }

    /* JADX INFO: renamed from: b */
    public static npc m65319b(npc npcVar, int i, String str, String str2, String str3, List list, boolean z, int i2) {
        String str4 = str;
        String str5 = npcVar.f156928a;
        if ((i2 & 4) != 0) {
            str4 = npcVar.f156930c;
        }
        if ((i2 & 8) != 0) {
            str2 = npcVar.f156931d;
        }
        if ((i2 & 16) != 0) {
            str3 = npcVar.f156932e;
        }
        if ((i2 & 32) != 0) {
            list = npcVar.f156933f;
        }
        if ((i2 & 64) != 0) {
            z = npcVar.f156934g;
        }
        boolean z2 = z;
        npcVar.getClass();
        List list2 = list;
        String str6 = str3;
        return new npc(i, str5, str4, str2, str6, list2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof npc)) {
            return false;
        }
        npc npcVar = (npc) obj;
        return wj50.m88271j(this.f156928a, npcVar.f156928a) && this.f156929b == npcVar.f156929b && wj50.m88271j(this.f156930c, npcVar.f156930c) && wj50.m88271j(this.f156931d, npcVar.f156931d) && wj50.m88271j(this.f156932e, npcVar.f156932e) && wj50.m88271j(this.f156933f, npcVar.f156933f) && this.f156934g == npcVar.f156934g;
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f156929b, this.f156928a.hashCode() * 31, 31);
        String str = this.f156930c;
        int iHashCode = (iM40938f + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f156931d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f156932e;
        return Boolean.hashCode(this.f156934g) + s571.m77244c((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f156933f);
    }

    public /* synthetic */ npc(String str) {
        this(4, str, null, null, null, lau.f131415a, false);
    }
}
