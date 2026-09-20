package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class d7i {

    /* JADX INFO: renamed from: a */
    public final String f46200a;

    /* JADX INFO: renamed from: b */
    public final String f46201b;

    /* JADX INFO: renamed from: c */
    public final String f46202c;

    /* JADX INFO: renamed from: d */
    public final String f46203d;

    /* JADX INFO: renamed from: e */
    public final String f46204e;

    /* JADX INFO: renamed from: f */
    public final String f46205f;

    /* JADX INFO: renamed from: g */
    public final String f46206g;

    /* JADX INFO: renamed from: h */
    public final List f46207h;

    /* JADX INFO: renamed from: i */
    public final List f46208i;

    /* JADX INFO: renamed from: j */
    public final List f46209j;

    /* JADX INFO: renamed from: k */
    public final List f46210k;

    /* JADX INFO: renamed from: l */
    public final String f46211l;

    /* JADX INFO: renamed from: m */
    public final String f46212m;

    /* JADX INFO: renamed from: n */
    public final boolean f46213n;

    /* JADX INFO: renamed from: o */
    public final boolean f46214o;

    /* JADX INFO: renamed from: p */
    public final List f46215p;

    /* JADX INFO: renamed from: q */
    public final boolean f46216q;

    /* JADX INFO: renamed from: r */
    public final boolean f46217r;

    /* JADX INFO: renamed from: s */
    public final Long f46218s;

    /* JADX INFO: renamed from: t */
    public final c7i f46219t;

    /* JADX INFO: renamed from: u */
    public final boolean f46220u;

    /* JADX INFO: renamed from: v */
    public final Integer f46221v;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ d7i(String str, String str2, String str3, String str4, String str5, String str6, String str7, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, String str8, String str9, boolean z, List list, boolean z2, boolean z3, Long l, c7i c7iVar, boolean z4, Integer num, int i) {
        String str10 = (i & 16) != 0 ? null : str5;
        String str11 = (i & 32) != 0 ? null : str6;
        String str12 = (i & 64) != 0 ? null : str7;
        int i2 = i & 128;
        lau lauVar = lau.f131415a;
        this(str, str2, str3, str4, str10, str11, str12, i2 != 0 ? lauVar : arrayList, (i & 256) != 0 ? lauVar : arrayList2, (i & 512) != 0 ? lauVar : arrayList3, (i & 1024) != 0 ? lauVar : arrayList4, str8, str9, (i & 8192) != 0 ? false : z, false, (32768 & i) != 0 ? lauVar : list, (65536 & i) != 0 ? false : z2, (131072 & i) != 0 ? false : z3, (262144 & i) != 0 ? null : l, (524288 & i) != 0 ? null : c7iVar, (1048576 & i) != 0 ? false : z4, (i & 2097152) != 0 ? null : num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7i)) {
            return false;
        }
        d7i d7iVar = (d7i) obj;
        return wj50.m88271j(this.f46200a, d7iVar.f46200a) && wj50.m88271j(this.f46201b, d7iVar.f46201b) && wj50.m88271j(this.f46202c, d7iVar.f46202c) && wj50.m88271j(this.f46203d, d7iVar.f46203d) && wj50.m88271j(this.f46204e, d7iVar.f46204e) && wj50.m88271j(this.f46205f, d7iVar.f46205f) && wj50.m88271j(this.f46206g, d7iVar.f46206g) && wj50.m88271j(this.f46207h, d7iVar.f46207h) && wj50.m88271j(this.f46208i, d7iVar.f46208i) && wj50.m88271j(this.f46209j, d7iVar.f46209j) && wj50.m88271j(this.f46210k, d7iVar.f46210k) && wj50.m88271j(this.f46211l, d7iVar.f46211l) && wj50.m88271j(this.f46212m, d7iVar.f46212m) && this.f46213n == d7iVar.f46213n && this.f46214o == d7iVar.f46214o && wj50.m88271j(this.f46215p, d7iVar.f46215p) && this.f46216q == d7iVar.f46216q && this.f46217r == d7iVar.f46217r && wj50.m88271j(this.f46218s, d7iVar.f46218s) && wj50.m88271j(this.f46219t, d7iVar.f46219t) && this.f46220u == d7iVar.f46220u && wj50.m88271j(this.f46221v, d7iVar.f46221v);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(this.f46200a.hashCode() * 31, 31, this.f46201b), 31, this.f46202c), 31, this.f46203d);
        String str = this.f46204e;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f46205f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f46206g;
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77244c(s571.m77245d(s571.m77245d(s571.m77243b(s571.m77243b(s571.m77244c(s571.m77244c(s571.m77244c(s571.m77244c((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f46207h), 31, this.f46208i), 31, this.f46209j), 31, this.f46210k), 31, this.f46211l), 31, this.f46212m), 31, this.f46213n), 31, this.f46214o), 31, this.f46215p), 31, this.f46216q), 31, this.f46217r);
        Long l = this.f46218s;
        int iHashCode3 = (iM77245d + (l == null ? 0 : l.hashCode())) * 31;
        c7i c7iVar = this.f46219t;
        int iM77245d2 = s571.m77245d((iHashCode3 + (c7iVar == null ? 0 : c7iVar.hashCode())) * 31, 31, this.f46220u);
        Integer num = this.f46221v;
        return iM77245d2 + (num != null ? num.hashCode() : 0);
    }

    public d7i(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, List list3, List list4, String str8, String str9, boolean z, boolean z2, List list5, boolean z3, boolean z4, Long l, c7i c7iVar, boolean z5, Integer num) {
        this.f46200a = str;
        this.f46201b = str2;
        this.f46202c = str3;
        this.f46203d = str4;
        this.f46204e = str5;
        this.f46205f = str6;
        this.f46206g = str7;
        this.f46207h = list;
        this.f46208i = list2;
        this.f46209j = list3;
        this.f46210k = list4;
        this.f46211l = str8;
        this.f46212m = str9;
        this.f46213n = z;
        this.f46214o = z2;
        this.f46215p = list5;
        this.f46216q = z3;
        this.f46217r = z4;
        this.f46218s = l;
        this.f46219t = c7iVar;
        this.f46220u = z5;
        this.f46221v = num;
    }
}
