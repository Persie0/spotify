package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class ye20 {

    /* JADX INFO: renamed from: a */
    public final String f271902a;

    /* JADX INFO: renamed from: b */
    public final String f271903b;

    /* JADX INFO: renamed from: c */
    public final String f271904c;

    /* JADX INFO: renamed from: d */
    public final String f271905d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f271906e;

    /* JADX INFO: renamed from: f */
    public final wna f271907f;

    public ye20(String str, String str2, String str3, String str4, ArrayList arrayList, wna wnaVar) {
        this.f271902a = str;
        this.f271903b = str2;
        this.f271904c = str3;
        this.f271905d = str4;
        this.f271906e = arrayList;
        this.f271907f = wnaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ye20)) {
            return false;
        }
        ye20 ye20Var = (ye20) obj;
        return wj50.m88271j(this.f271902a, ye20Var.f271902a) && this.f271903b.equals(ye20Var.f271903b) && wj50.m88271j(this.f271904c, ye20Var.f271904c) && wj50.m88271j(this.f271905d, ye20Var.f271905d) && this.f271906e.equals(ye20Var.f271906e) && this.f271907f == ye20Var.f271907f;
    }

    public final int hashCode() {
        return this.f271907f.hashCode() + lq51.m59700f(this.f271906e, s571.m77243b(s571.m77243b(s571.m77243b(this.f271902a.hashCode() * 31, 31, this.f271903b), 31, this.f271904c), 31, this.f271905d), 31);
    }
}
