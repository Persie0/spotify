package p204p;

import com.spotify.music.R;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzb {

    /* JADX INFO: renamed from: a */
    public final String f287934a;

    /* JADX INFO: renamed from: b */
    public final String f287935b;

    /* JADX INFO: renamed from: c */
    public final Integer f287936c;

    /* JADX INFO: renamed from: d */
    public final String f287937d;

    /* JADX INFO: renamed from: e */
    public final String f287938e;

    /* JADX INFO: renamed from: f */
    public final s2c f287939f;

    /* JADX INFO: renamed from: g */
    public final List f287940g;

    /* JADX INFO: renamed from: h */
    public final boolean f287941h;

    /* JADX INFO: renamed from: i */
    public final v1c f287942i;

    /* JADX INFO: renamed from: j */
    public final long f287943j;

    public zzb(String str, String str2, String str3, String str4, s2c s2cVar, List list, boolean z, v1c v1cVar, long j, int i) {
        Integer numValueOf = Integer.valueOf(R.drawable.encore_icon_enhance_16);
        str2 = (i & 2) != 0 ? null : str2;
        numValueOf = (i & 4) != 0 ? null : numValueOf;
        str3 = (i & 8) != 0 ? null : str3;
        z = (i & 128) != 0 ? false : z;
        j = (i & 512) != 0 ? 0L : j;
        this.f287934a = str;
        this.f287935b = str2;
        this.f287936c = numValueOf;
        this.f287937d = str3;
        this.f287938e = str4;
        this.f287939f = s2cVar;
        this.f287940g = list;
        this.f287941h = z;
        this.f287942i = v1cVar;
        this.f287943j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzb)) {
            return false;
        }
        zzb zzbVar = (zzb) obj;
        return wj50.m88271j(this.f287934a, zzbVar.f287934a) && wj50.m88271j(this.f287935b, zzbVar.f287935b) && wj50.m88271j(this.f287936c, zzbVar.f287936c) && wj50.m88271j(this.f287937d, zzbVar.f287937d) && wj50.m88271j(this.f287938e, zzbVar.f287938e) && this.f287939f == zzbVar.f287939f && wj50.m88271j(this.f287940g, zzbVar.f287940g) && this.f287941h == zzbVar.f287941h && wj50.m88271j(this.f287942i, zzbVar.f287942i) && this.f287943j == zzbVar.f287943j;
    }

    public final int hashCode() {
        int iHashCode = this.f287934a.hashCode() * 31;
        String str = this.f287935b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f287936c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f287937d;
        return Long.hashCode(this.f287943j) + ((this.f287942i.hashCode() + s571.m77245d(s571.m77244c((this.f287939f.hashCode() + s571.m77243b((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f287938e)) * 31, 31, this.f287940g), 31, this.f287941h)) * 31);
    }
}
