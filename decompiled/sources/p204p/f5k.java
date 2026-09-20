package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class f5k {

    /* JADX INFO: renamed from: a */
    public final String f66094a;

    /* JADX INFO: renamed from: b */
    public final wwu f66095b;

    /* JADX INFO: renamed from: c */
    public final c5k f66096c;

    /* JADX INFO: renamed from: d */
    public final Integer f66097d;

    /* JADX INFO: renamed from: e */
    public final String f66098e;

    /* JADX INFO: renamed from: f */
    public final Integer f66099f;

    /* JADX INFO: renamed from: g */
    public final boolean f66100g;

    /* JADX INFO: renamed from: h */
    public final p221 f66101h;

    /* JADX INFO: renamed from: i */
    public final e5k f66102i;

    public f5k(String str, wwu wwuVar, c5k c5kVar, Integer num, String str2, Integer num2, boolean z, p221 p221Var, e5k e5kVar) {
        this.f66094a = str;
        this.f66095b = wwuVar;
        this.f66096c = c5kVar;
        this.f66097d = num;
        this.f66098e = str2;
        this.f66099f = num2;
        this.f66100g = z;
        this.f66101h = p221Var;
        this.f66102i = e5kVar;
        if (!((num != null) ^ (str2 != null))) {
            throw new IllegalArgumentException("Exactly one title property must be populated.");
        }
        if (!((c5kVar != null) ^ (wwuVar != null))) {
            throw new IllegalArgumentException("Exactly one icon property must be populated.");
        }
    }

    /* JADX INFO: renamed from: a */
    public static f5k m40766a(f5k f5kVar, String str, e5k e5kVar, int i) {
        Integer numValueOf = Integer.valueOf(R.string.comment_context_menu_option_report);
        if ((i & 1) != 0) {
            str = f5kVar.f66094a;
        }
        String str2 = str;
        wwu wwuVar = f5kVar.f66095b;
        c5k c5kVar = f5kVar.f66096c;
        if ((i & 8) != 0) {
            numValueOf = f5kVar.f66097d;
        }
        Integer num = numValueOf;
        String str3 = (i & 16) != 0 ? f5kVar.f66098e : null;
        Integer num2 = f5kVar.f66099f;
        boolean z = (i & 64) != 0 ? f5kVar.f66100g : false;
        p221 p221Var = f5kVar.f66101h;
        if ((i & 256) != 0) {
            e5kVar = f5kVar.f66102i;
        }
        return new f5k(str2, wwuVar, c5kVar, num, str3, num2, z, p221Var, e5kVar);
    }

    /* JADX INFO: renamed from: b */
    public final p221 m40767b() {
        return this.f66101h;
    }

    /* JADX INFO: renamed from: c */
    public final e5k m40768c() {
        return this.f66102i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5k)) {
            return false;
        }
        f5k f5kVar = (f5k) obj;
        return wj50.m88271j(this.f66094a, f5kVar.f66094a) && wj50.m88271j(this.f66095b, f5kVar.f66095b) && wj50.m88271j(this.f66096c, f5kVar.f66096c) && wj50.m88271j(this.f66097d, f5kVar.f66097d) && wj50.m88271j(this.f66098e, f5kVar.f66098e) && wj50.m88271j(this.f66099f, f5kVar.f66099f) && this.f66100g == f5kVar.f66100g && wj50.m88271j(this.f66101h, f5kVar.f66101h) && wj50.m88271j(this.f66102i, f5kVar.f66102i);
    }

    public final int hashCode() {
        int iHashCode = this.f66094a.hashCode() * 31;
        wwu wwuVar = this.f66095b;
        int iHashCode2 = (iHashCode + (wwuVar == null ? 0 : wwuVar.hashCode())) * 31;
        c5k c5kVar = this.f66096c;
        int iHashCode3 = (iHashCode2 + (c5kVar == null ? 0 : c5kVar.hashCode())) * 31;
        Integer num = this.f66097d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f66098e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f66099f;
        int iM77245d = s571.m77245d((iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f66100g);
        p221 p221Var = this.f66101h;
        return this.f66102i.hashCode() + ((iM77245d + (p221Var != null ? p221Var.hashCode() : 0)) * 31);
    }

    public /* synthetic */ f5k(String str, wwu wwuVar, c5k c5kVar, Integer num, String str2, boolean z, p221 p221Var, e5k e5kVar, int i) {
        this(str, wwuVar, (i & 4) != 0 ? null : c5kVar, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : Integer.valueOf(R.string.song_dna_context_menu_item_accessibility_label), (i & 64) != 0 ? true : z, (i & 128) != 0 ? null : p221Var, e5kVar);
    }
}
