package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class cp7 {

    /* JADX INFO: renamed from: a */
    public final String f40474a;

    /* JADX INFO: renamed from: b */
    public final String f40475b;

    /* JADX INFO: renamed from: c */
    public final String f40476c;

    /* JADX INFO: renamed from: d */
    public final String f40477d;

    /* JADX INFO: renamed from: e */
    public final String f40478e;

    /* JADX INFO: renamed from: f */
    public final is9 f40479f;

    /* JADX INFO: renamed from: g */
    public final String f40480g;

    /* JADX INFO: renamed from: h */
    public final rcm0 f40481h;

    /* JADX INFO: renamed from: i */
    public final List f40482i;

    public cp7(String str, String str2, String str3, String str4, String str5, is9 is9Var, String str6, rcm0 rcm0Var, List list) {
        this.f40474a = str;
        this.f40475b = str2;
        this.f40476c = str3;
        this.f40477d = str4;
        this.f40478e = str5;
        this.f40479f = is9Var;
        this.f40480g = str6;
        this.f40481h = rcm0Var;
        this.f40482i = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp7)) {
            return false;
        }
        cp7 cp7Var = (cp7) obj;
        return wj50.m88271j(this.f40474a, cp7Var.f40474a) && wj50.m88271j(this.f40475b, cp7Var.f40475b) && wj50.m88271j(this.f40476c, cp7Var.f40476c) && wj50.m88271j(this.f40477d, cp7Var.f40477d) && wj50.m88271j(this.f40478e, cp7Var.f40478e) && wj50.m88271j(this.f40479f, cp7Var.f40479f) && wj50.m88271j(this.f40480g, cp7Var.f40480g) && wj50.m88271j(this.f40481h, cp7Var.f40481h) && wj50.m88271j(this.f40482i, cp7Var.f40482i);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f40474a.hashCode() * 31, 31, this.f40475b);
        String str = this.f40476c;
        return this.f40482i.hashCode() + yds.m93483m(this.f40481h, s571.m77243b((this.f40479f.hashCode() + s571.m77243b(s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f40477d), 31, this.f40478e)) * 31, 31, this.f40480g), 31);
    }
}
