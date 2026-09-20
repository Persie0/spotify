package p204p;

import com.spotify.home.evopage.mobius.Event;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class cvw implements Event {

    /* JADX INFO: renamed from: a */
    public final Object f42555a;

    /* JADX INFO: renamed from: b */
    public final Set f42556b;

    /* JADX INFO: renamed from: c */
    public final Set f42557c;

    /* JADX INFO: renamed from: d */
    public final ebf0 f42558d;

    /* JADX INFO: renamed from: e */
    public final t3x0 f42559e;

    /* JADX INFO: renamed from: f */
    public final boolean f42560f;

    /* JADX INFO: renamed from: g */
    public final i3a0 f42561g;

    /* JADX INFO: renamed from: h */
    public final String f42562h;

    /* JADX INFO: renamed from: i */
    public final Set f42563i;

    /* JADX INFO: renamed from: j */
    public final kaa0 f42564j;

    /* JADX INFO: renamed from: k */
    public final String f42565k;

    /* JADX INFO: renamed from: l */
    public final String f42566l;

    public cvw(List list, Set set, Set set2, ebf0 ebf0Var, t3x0 t3x0Var, boolean z, i3a0 i3a0Var, String str, Set set3, kaa0 kaa0Var, String str2, String str3) {
        this.f42555a = list;
        this.f42556b = set;
        this.f42557c = set2;
        this.f42558d = ebf0Var;
        this.f42559e = t3x0Var;
        this.f42560f = z;
        this.f42561g = i3a0Var;
        this.f42562h = str;
        this.f42563i = set3;
        this.f42564j = kaa0Var;
        this.f42565k = str2;
        this.f42566l = str3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // com.spotify.home.evopage.mobius.Event
    public final String breadcrumb() {
        int size = this.f42555a.size();
        StringBuilder sb = new StringBuilder("GotHomeStructure: ");
        sb.append(size);
        sb.append(" sections, isConnected: ");
        sb.append(this.f42560f);
        sb.append(", loadSource: ");
        sb.append(this.f42561g);
        sb.append(", loadingStrategy: ");
        sb.append(this.f42564j);
        sb.append(", filterValue: ");
        klh.m56844p(sb, this.f42562h, ", pageToken ", this.f42565k, ", refreshToken ");
        sb.append(this.f42566l);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvw)) {
            return false;
        }
        cvw cvwVar = (cvw) obj;
        return this.f42555a.equals(cvwVar.f42555a) && this.f42556b.equals(cvwVar.f42556b) && wj50.m88271j(this.f42557c, cvwVar.f42557c) && wj50.m88271j(this.f42558d, cvwVar.f42558d) && wj50.m88271j(this.f42559e, cvwVar.f42559e) && this.f42560f == cvwVar.f42560f && this.f42561g == cvwVar.f42561g && wj50.m88271j(this.f42562h, cvwVar.f42562h) && wj50.m88271j(this.f42563i, cvwVar.f42563i) && this.f42564j == cvwVar.f42564j && wj50.m88271j(this.f42565k, cvwVar.f42565k) && wj50.m88271j(this.f42566l, cvwVar.f42566l);
    }

    public final int hashCode() {
        int iM56830b = klh.m56830b(klh.m56830b(this.f42555a.hashCode() * 31, 31, this.f42556b), 31, this.f42557c);
        ebf0 ebf0Var = this.f42558d;
        int iM77243b = s571.m77243b((this.f42561g.hashCode() + s571.m77245d(j4x.m52406d(this.f42559e, (iM56830b + (ebf0Var == null ? 0 : ebf0Var.f57921a.hashCode())) * 31, 31), 31, this.f42560f)) * 31, 31, this.f42562h);
        Set set = this.f42563i;
        int iM77243b2 = s571.m77243b((this.f42564j.hashCode() + ((iM77243b + (set == null ? 0 : set.hashCode())) * 31)) * 31, 31, this.f42565k);
        String str = this.f42566l;
        return iM77243b2 + (str != null ? str.hashCode() : 0);
    }
}
