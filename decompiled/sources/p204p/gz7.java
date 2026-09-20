package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gz7 extends f4l {

    /* JADX INFO: renamed from: a */
    public final String f85850a;

    /* JADX INFO: renamed from: b */
    public final String f85851b;

    /* JADX INFO: renamed from: c */
    public final String f85852c;

    /* JADX INFO: renamed from: d */
    public final long f85853d;

    /* JADX INFO: renamed from: e */
    public final Long f85854e;

    /* JADX INFO: renamed from: f */
    public final boolean f85855f;

    /* JADX INFO: renamed from: g */
    public final n3l f85856g;

    /* JADX INFO: renamed from: h */
    public final e4l f85857h;

    /* JADX INFO: renamed from: i */
    public final d4l f85858i;

    /* JADX INFO: renamed from: j */
    public final o3l f85859j;

    /* JADX INFO: renamed from: k */
    public final List f85860k;

    /* JADX INFO: renamed from: l */
    public final int f85861l;

    public gz7(String str, String str2, String str3, long j, Long l, boolean z, n3l n3lVar, e4l e4lVar, d4l d4lVar, o3l o3lVar, List list, int i) {
        this.f85850a = str;
        this.f85851b = str2;
        this.f85852c = str3;
        this.f85853d = j;
        this.f85854e = l;
        this.f85855f = z;
        this.f85856g = n3lVar;
        this.f85857h = e4lVar;
        this.f85858i = d4lVar;
        this.f85859j = o3lVar;
        this.f85860k = list;
        this.f85861l = i;
    }

    @Override // p204p.f4l
    /* JADX INFO: renamed from: a */
    public final fz7 mo40735a() {
        fz7 fz7Var = new fz7();
        fz7Var.f74924a = this.f85850a;
        fz7Var.f74925b = this.f85851b;
        fz7Var.f74926c = this.f85852c;
        fz7Var.f74927d = this.f85853d;
        fz7Var.f74928e = this.f85854e;
        fz7Var.f74929f = this.f85855f;
        fz7Var.f74930g = this.f85856g;
        fz7Var.f74931h = this.f85857h;
        fz7Var.f74932i = this.f85858i;
        fz7Var.f74933j = this.f85859j;
        fz7Var.f74934k = this.f85860k;
        fz7Var.f74935l = this.f85861l;
        fz7Var.f74936m = (byte) 7;
        return fz7Var;
    }

    public final boolean equals(Object obj) {
        String str;
        Long l;
        e4l e4lVar;
        d4l d4lVar;
        o3l o3lVar;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f4l) {
            gz7 gz7Var = (gz7) ((f4l) obj);
            List list2 = gz7Var.f85860k;
            o3l o3lVar2 = gz7Var.f85859j;
            d4l d4lVar2 = gz7Var.f85858i;
            e4l e4lVar2 = gz7Var.f85857h;
            Long l2 = gz7Var.f85854e;
            String str2 = gz7Var.f85852c;
            if (this.f85850a.equals(gz7Var.f85850a) && this.f85851b.equals(gz7Var.f85851b) && ((str = this.f85852c) != null ? str.equals(str2) : str2 == null) && this.f85853d == gz7Var.f85853d && ((l = this.f85854e) != null ? l.equals(l2) : l2 == null) && this.f85855f == gz7Var.f85855f && this.f85856g.equals(gz7Var.f85856g) && ((e4lVar = this.f85857h) != null ? e4lVar.equals(e4lVar2) : e4lVar2 == null) && ((d4lVar = this.f85858i) != null ? d4lVar.equals(d4lVar2) : d4lVar2 == null) && ((o3lVar = this.f85859j) != null ? o3lVar.equals(o3lVar2) : o3lVar2 == null) && ((list = this.f85860k) != null ? list.equals(list2) : list2 == null) && this.f85861l == gz7Var.f85861l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f85850a.hashCode() ^ 1000003) * 1000003) ^ this.f85851b.hashCode()) * 1000003;
        String str = this.f85852c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j = this.f85853d;
        int i = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        Long l = this.f85854e;
        int iHashCode3 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f85855f ? 1231 : 1237)) * 1000003) ^ this.f85856g.hashCode()) * 1000003;
        e4l e4lVar = this.f85857h;
        int iHashCode4 = (iHashCode3 ^ (e4lVar == null ? 0 : e4lVar.hashCode())) * 1000003;
        d4l d4lVar = this.f85858i;
        int iHashCode5 = (iHashCode4 ^ (d4lVar == null ? 0 : d4lVar.hashCode())) * 1000003;
        o3l o3lVar = this.f85859j;
        int iHashCode6 = (iHashCode5 ^ (o3lVar == null ? 0 : o3lVar.hashCode())) * 1000003;
        List list = this.f85860k;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f85861l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.f85850a);
        sb.append(", identifier=");
        sb.append(this.f85851b);
        sb.append(", appQualitySessionId=");
        sb.append(this.f85852c);
        sb.append(", startedAt=");
        sb.append(this.f85853d);
        sb.append(", endedAt=");
        sb.append(this.f85854e);
        sb.append(", crashed=");
        sb.append(this.f85855f);
        sb.append(", app=");
        sb.append(this.f85856g);
        sb.append(", user=");
        sb.append(this.f85857h);
        sb.append(", os=");
        sb.append(this.f85858i);
        sb.append(", device=");
        sb.append(this.f85859j);
        sb.append(", events=");
        sb.append(this.f85860k);
        sb.append(", generatorType=");
        return klh.m56832d(this.f85861l, "}", sb);
    }
}
