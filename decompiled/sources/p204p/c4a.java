package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class c4a implements g4a {

    /* JADX INFO: renamed from: a */
    public final String f33892a;

    /* JADX INFO: renamed from: b */
    public final String f33893b;

    /* JADX INFO: renamed from: c */
    public final String f33894c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f33895d;

    /* JADX INFO: renamed from: e */
    public final a4a f33896e;

    public c4a(String str, String str2, String str3, ArrayList arrayList, a4a a4aVar) {
        this.f33892a = str;
        this.f33893b = str2;
        this.f33894c = str3;
        this.f33895d = arrayList;
        this.f33896e = a4aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4a)) {
            return false;
        }
        c4a c4aVar = (c4a) obj;
        return wj50.m88271j(this.f33892a, c4aVar.f33892a) && wj50.m88271j(this.f33893b, c4aVar.f33893b) && wj50.m88271j(this.f33894c, c4aVar.f33894c) && this.f33895d.equals(c4aVar.f33895d) && this.f33896e.equals(c4aVar.f33896e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f33892a.hashCode() * 31, 31, this.f33893b);
        String str = this.f33894c;
        return this.f33896e.hashCode() + lq51.m59700f(this.f33895d, (iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31);
    }
}
