package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class xy50 {

    /* JADX INFO: renamed from: a */
    public final String f267222a;

    /* JADX INFO: renamed from: b */
    public final String f267223b;

    /* JADX INFO: renamed from: c */
    public final String f267224c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f267225d;

    public xy50(String str, String str2, String str3, ArrayList arrayList) {
        this.f267222a = str;
        this.f267223b = str2;
        this.f267224c = str3;
        this.f267225d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xy50)) {
            return false;
        }
        xy50 xy50Var = (xy50) obj;
        return wj50.m88271j(this.f267222a, xy50Var.f267222a) && wj50.m88271j(this.f267223b, xy50Var.f267223b) && wj50.m88271j(this.f267224c, xy50Var.f267224c) && this.f267225d.equals(xy50Var.f267225d);
    }

    public final int hashCode() {
        return this.f267225d.hashCode() + s571.m77245d(s571.m77243b(s571.m77243b(this.f267222a.hashCode() * 31, 31, this.f267223b), 31, this.f267224c), 31, true);
    }
}
