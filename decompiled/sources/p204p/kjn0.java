package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes8.dex */
public final class kjn0 {

    /* JADX INFO: renamed from: a */
    public final String f123384a;

    /* JADX INFO: renamed from: b */
    public final Bundle f123385b;

    /* JADX INFO: renamed from: c */
    public final String f123386c;

    /* JADX INFO: renamed from: d */
    public final long f123387d;

    public kjn0(long j, String str, String str2, Bundle bundle) {
        this.f123384a = str;
        this.f123385b = bundle;
        this.f123386c = str2;
        this.f123387d = j;
    }

    /* JADX INFO: renamed from: a */
    public final String m56609a() {
        return this.f123386c;
    }

    /* JADX INFO: renamed from: b */
    public final Bundle m56610b() {
        return this.f123385b;
    }

    /* JADX INFO: renamed from: c */
    public final String m56611c() {
        return this.f123384a;
    }

    /* JADX INFO: renamed from: d */
    public final long m56612d() {
        return this.f123387d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjn0)) {
            return false;
        }
        kjn0 kjn0Var = (kjn0) obj;
        return wj50.m88271j(this.f123384a, kjn0Var.f123384a) && wj50.m88271j(this.f123385b, kjn0Var.f123385b) && wj50.m88271j(this.f123386c, kjn0Var.f123386c) && this.f123387d == kjn0Var.f123387d;
    }

    public final int hashCode() {
        int iHashCode = this.f123384a.hashCode() * 31;
        Bundle bundle = this.f123385b;
        return Long.hashCode(this.f123387d) + s571.m77243b((iHashCode + (bundle == null ? 0 : bundle.hashCode())) * 31, 31, this.f123386c);
    }
}
