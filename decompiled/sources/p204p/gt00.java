package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes6.dex */
public final class gt00 {

    /* JADX INFO: renamed from: a */
    public final String f84057a;

    /* JADX INFO: renamed from: b */
    public final String f84058b;

    /* JADX INFO: renamed from: c */
    public final String f84059c;

    /* JADX INFO: renamed from: d */
    public final Uri f84060d;

    /* JADX INFO: renamed from: e */
    public final String f84061e;

    /* JADX INFO: renamed from: f */
    public final String f84062f;

    public gt00(Uri uri, String str, String str2, String str3, String str4, String str5) {
        this.f84057a = str;
        this.f84058b = str2;
        this.f84059c = str3;
        this.f84060d = uri;
        this.f84061e = str4;
        this.f84062f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gt00)) {
            return false;
        }
        gt00 gt00Var = (gt00) obj;
        return wj50.m88271j(this.f84057a, gt00Var.f84057a) && wj50.m88271j(this.f84058b, gt00Var.f84058b) && wj50.m88271j(this.f84059c, gt00Var.f84059c) && wj50.m88271j(this.f84060d, gt00Var.f84060d) && wj50.m88271j(this.f84061e, gt00Var.f84061e) && wj50.m88271j(this.f84062f, gt00Var.f84062f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f84057a.hashCode() * 31, 31, this.f84058b), 31, this.f84059c);
        Uri uri = this.f84060d;
        return this.f84062f.hashCode() + s571.m77243b((iM77243b + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.f84061e);
    }
}
