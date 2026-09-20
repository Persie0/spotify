package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class v4d implements h5d {

    /* JADX INFO: renamed from: a */
    public final String f237120a;

    /* JADX INFO: renamed from: b */
    public final String f237121b;

    /* JADX INFO: renamed from: c */
    public final pck f237122c;

    /* JADX INFO: renamed from: d */
    public final boolean f237123d;

    /* JADX INFO: renamed from: e */
    public final boolean f237124e;

    public v4d(String str, String str2, pck pckVar, boolean z, boolean z2) {
        this.f237120a = str;
        this.f237121b = str2;
        this.f237122c = pckVar;
        this.f237123d = z;
        this.f237124e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4d)) {
            return false;
        }
        v4d v4dVar = (v4d) obj;
        return wj50.m88271j(this.f237120a, v4dVar.f237120a) && wj50.m88271j(this.f237121b, v4dVar.f237121b) && wj50.m88271j(this.f237122c, v4dVar.f237122c) && this.f237123d == v4dVar.f237123d && this.f237124e == v4dVar.f237124e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f237124e) + s571.m77245d((this.f237122c.hashCode() + s571.m77243b(this.f237120a.hashCode() * 31, 31, this.f237121b)) * 31, 31, this.f237123d);
    }
}
