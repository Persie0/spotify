package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class v4s {

    /* JADX INFO: renamed from: a */
    public final qas f237233a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f237234b;

    /* JADX INFO: renamed from: c */
    public final String f237235c;

    /* JADX INFO: renamed from: d */
    public final String f237236d;

    /* JADX INFO: renamed from: e */
    public final String f237237e;

    public v4s(qas qasVar, ArrayList arrayList, String str, String str2, String str3) {
        this.f237233a = qasVar;
        this.f237234b = arrayList;
        this.f237235c = str;
        this.f237236d = str2;
        this.f237237e = str3;
    }

    /* JADX INFO: renamed from: a */
    public final String m84658a() {
        return this.f237237e;
    }

    /* JADX INFO: renamed from: b */
    public final String m84659b() {
        return this.f237235c;
    }

    /* JADX INFO: renamed from: c */
    public final List m84660c() {
        return this.f237234b;
    }

    /* JADX INFO: renamed from: d */
    public final qas m84661d() {
        return this.f237233a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4s)) {
            return false;
        }
        v4s v4sVar = (v4s) obj;
        return this.f237233a.equals(v4sVar.f237233a) && this.f237234b.equals(v4sVar.f237234b) && wj50.m88271j(this.f237235c, v4sVar.f237235c) && wj50.m88271j(this.f237236d, v4sVar.f237236d) && wj50.m88271j(this.f237237e, v4sVar.f237237e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(lq51.m59700f(this.f237234b, this.f237233a.hashCode() * 31, 31), 31, this.f237235c);
        String str = this.f237236d;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f237237e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
