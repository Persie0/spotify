package p204p;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class bfk implements cfk {

    /* JADX INFO: renamed from: a */
    public final pla1 f26736a;

    /* JADX INFO: renamed from: b */
    public final String f26737b;

    /* JADX INFO: renamed from: c */
    public final String f26738c;

    /* JADX INFO: renamed from: d */
    public final boolean f26739d;

    /* JADX INFO: renamed from: e */
    public final sl00 f26740e;

    /* JADX INFO: renamed from: f */
    public final gh00 f26741f;

    static {
        Parcelable.Creator<pla1> creator = pla1.CREATOR;
    }

    public bfk(pla1 pla1Var, String str, String str2, boolean z, sl00 sl00Var, gh00 gh00Var) {
        this.f26736a = pla1Var;
        this.f26737b = str;
        this.f26738c = str2;
        this.f26739d = z;
        this.f26740e = sl00Var;
        this.f26741f = gh00Var;
    }

    @Override // p204p.cfk
    /* JADX INFO: renamed from: B */
    public final String mo25815B() {
        return this.f26738c;
    }

    @Override // p204p.cfk
    /* JADX INFO: renamed from: C */
    public final boolean mo25816C() {
        return this.f26739d;
    }

    @Override // p204p.cfk
    /* JADX INFO: renamed from: a */
    public final String mo25817a() {
        return this.f26737b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfk)) {
            return false;
        }
        bfk bfkVar = (bfk) obj;
        return wj50.m88271j(this.f26736a, bfkVar.f26736a) && wj50.m88271j(this.f26737b, bfkVar.f26737b) && wj50.m88271j(this.f26738c, bfkVar.f26738c) && this.f26739d == bfkVar.f26739d && wj50.m88271j(this.f26740e, bfkVar.f26740e) && wj50.m88271j(this.f26741f, bfkVar.f26741f);
    }

    @Override // p204p.cfk
    public final pla1 getSender() {
        return this.f26736a;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f26736a.hashCode() * 31, 31, this.f26737b);
        String str = this.f26738c;
        return this.f26741f.hashCode() + ((this.f26740e.hashCode() + s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f26739d)) * 31);
    }
}
