package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class arz0 {

    /* JADX INFO: renamed from: g */
    public static final arz0 f19261g = new arz0("", "", "", "", "", nau.f152117a);

    /* JADX INFO: renamed from: a */
    public final String f19262a;

    /* JADX INFO: renamed from: b */
    public final String f19263b;

    /* JADX INFO: renamed from: c */
    public final String f19264c;

    /* JADX INFO: renamed from: d */
    public final String f19265d;

    /* JADX INFO: renamed from: e */
    public final String f19266e;

    /* JADX INFO: renamed from: f */
    public final Map f19267f;

    public arz0(String str, String str2, String str3, String str4, String str5, Map map) {
        this.f19262a = str;
        this.f19263b = str2;
        this.f19264c = str3;
        this.f19265d = str4;
        this.f19266e = str5;
        this.f19267f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arz0)) {
            return false;
        }
        arz0 arz0Var = (arz0) obj;
        return wj50.m88271j(this.f19262a, arz0Var.f19262a) && wj50.m88271j(this.f19263b, arz0Var.f19263b) && wj50.m88271j(this.f19264c, arz0Var.f19264c) && wj50.m88271j(this.f19265d, arz0Var.f19265d) && wj50.m88271j(this.f19266e, arz0Var.f19266e) && wj50.m88271j(this.f19267f, arz0Var.f19267f);
    }

    public final int hashCode() {
        return this.f19267f.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f19262a.hashCode() * 31, 31, this.f19263b), 31, this.f19264c), 31, this.f19265d), 31, this.f19266e);
    }
}
