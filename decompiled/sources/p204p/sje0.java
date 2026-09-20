package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@rtz0
public final class sje0 {
    public static final rje0 Companion = new rje0();

    /* JADX INFO: renamed from: f */
    public static final fr70[] f209823f = {null, q3d0.m72078I(2, sfe0.f208565c), null, null, null};

    /* JADX INFO: renamed from: a */
    public final String f209824a;

    /* JADX INFO: renamed from: b */
    public final List f209825b;

    /* JADX INFO: renamed from: c */
    public final String f209826c;

    /* JADX INFO: renamed from: d */
    public final String f209827d;

    /* JADX INFO: renamed from: e */
    public final boolean f209828e;

    public /* synthetic */ sje0(int i, String str, String str2, String str3, List list, boolean z) {
        if (19 != (i & 19)) {
            edo.m38617p(i, 19, qje0.f189227a.getDescriptor());
            throw null;
        }
        this.f209824a = str;
        this.f209825b = list;
        if ((i & 4) == 0) {
            this.f209826c = null;
        } else {
            this.f209826c = str2;
        }
        if ((i & 8) == 0) {
            this.f209827d = null;
        } else {
            this.f209827d = str3;
        }
        this.f209828e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sje0)) {
            return false;
        }
        sje0 sje0Var = (sje0) obj;
        return wj50.m88271j(this.f209824a, sje0Var.f209824a) && wj50.m88271j(this.f209825b, sje0Var.f209825b) && wj50.m88271j(this.f209826c, sje0Var.f209826c) && wj50.m88271j(this.f209827d, sje0Var.f209827d) && this.f209828e == sje0Var.f209828e;
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(this.f209824a.hashCode() * 31, 31, this.f209825b);
        String str = this.f209826c;
        int iHashCode = (iM77244c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f209827d;
        return Boolean.hashCode(this.f209828e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
