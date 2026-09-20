package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class y410 {

    /* JADX INFO: renamed from: a */
    public final String f269050a;

    /* JADX INFO: renamed from: b */
    public final String f269051b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f269052c;

    /* JADX INFO: renamed from: d */
    public final String f269053d;

    /* JADX INFO: renamed from: e */
    public final String f269054e;

    /* JADX INFO: renamed from: f */
    public final rcm0 f269055f;

    /* JADX INFO: renamed from: g */
    public final List f269056g;

    public y410(String str, String str2, CharSequence charSequence, String str3, String str4, rcm0 rcm0Var, List list) {
        this.f269050a = str;
        this.f269051b = str2;
        this.f269052c = charSequence;
        this.f269053d = str3;
        this.f269054e = str4;
        this.f269055f = rcm0Var;
        this.f269056g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y410)) {
            return false;
        }
        y410 y410Var = (y410) obj;
        return wj50.m88271j(this.f269050a, y410Var.f269050a) && wj50.m88271j(this.f269051b, y410Var.f269051b) && wj50.m88271j(this.f269052c, y410Var.f269052c) && wj50.m88271j(this.f269053d, y410Var.f269053d) && wj50.m88271j(this.f269054e, y410Var.f269054e) && wj50.m88271j(this.f269055f, y410Var.f269055f) && wj50.m88271j(this.f269056g, y410Var.f269056g);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f269050a.hashCode() * 31, 31, this.f269051b);
        CharSequence charSequence = this.f269052c;
        return this.f269056g.hashCode() + yds.m93483m(this.f269055f, s571.m77243b(s571.m77243b((iM77243b + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.f269053d), 31, this.f269054e), 31);
    }
}
