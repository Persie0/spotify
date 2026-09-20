package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class f5u {

    /* JADX INFO: renamed from: a */
    public final String f66171a;

    /* JADX INFO: renamed from: b */
    public final String f66172b;

    /* JADX INFO: renamed from: c */
    public final String f66173c;

    /* JADX INFO: renamed from: d */
    public final String f66174d;

    /* JADX INFO: renamed from: e */
    public final String f66175e;

    /* JADX INFO: renamed from: f */
    public final String f66176f;

    /* JADX INFO: renamed from: g */
    public final Object f66177g;

    public f5u(String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        this.f66171a = str;
        this.f66172b = str2;
        this.f66173c = str3;
        this.f66174d = str4;
        this.f66175e = str5;
        this.f66176f = str6;
        this.f66177g = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5u)) {
            return false;
        }
        f5u f5uVar = (f5u) obj;
        return wj50.m88271j(this.f66171a, f5uVar.f66171a) && wj50.m88271j(this.f66172b, f5uVar.f66172b) && wj50.m88271j(this.f66173c, f5uVar.f66173c) && wj50.m88271j(this.f66174d, f5uVar.f66174d) && wj50.m88271j(this.f66175e, f5uVar.f66175e) && wj50.m88271j(this.f66176f, f5uVar.f66176f) && this.f66177g.equals(f5uVar.f66177g);
    }

    public final int hashCode() {
        return this.f66177g.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f66171a.hashCode() * 31, 31, this.f66172b), 31, this.f66173c), 31, this.f66174d), 31, this.f66175e), 31, this.f66176f);
    }
}
