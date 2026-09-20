package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
@rtz0
public final class wsx {
    public static final vsx Companion = new vsx();

    /* JADX INFO: renamed from: f */
    public static final fr70[] f254768f = {null, null, null, q3d0.m72078I(2, tdv.f219504Y0), q3d0.m72078I(2, tdv.f219506Z0)};

    /* JADX INFO: renamed from: a */
    public final String f254769a;

    /* JADX INFO: renamed from: b */
    public final int f254770b;

    /* JADX INFO: renamed from: c */
    public final String f254771c;

    /* JADX INFO: renamed from: d */
    public final Set f254772d;

    /* JADX INFO: renamed from: e */
    public final Set f254773e;

    public /* synthetic */ wsx(int i, String str, int i2, String str2, Set set, Set set2) {
        if (5 != (i & 5)) {
            edo.m38617p(i, 5, usx.f233694a.getDescriptor());
            throw null;
        }
        this.f254769a = str;
        if ((i & 2) == 0) {
            this.f254770b = 0;
        } else {
            this.f254770b = i2;
        }
        this.f254771c = str2;
        int i3 = i & 8;
        gbu gbuVar = gbu.f78413a;
        if (i3 == 0) {
            this.f254772d = gbuVar;
        } else {
            this.f254772d = set;
        }
        if ((i & 16) == 0) {
            this.f254773e = gbuVar;
        } else {
            this.f254773e = set2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsx)) {
            return false;
        }
        wsx wsxVar = (wsx) obj;
        return wj50.m88271j(this.f254769a, wsxVar.f254769a) && this.f254770b == wsxVar.f254770b && wj50.m88271j(this.f254771c, wsxVar.f254771c) && wj50.m88271j(this.f254772d, wsxVar.f254772d) && wj50.m88271j(this.f254773e, wsxVar.f254773e);
    }

    public final int hashCode() {
        return this.f254773e.hashCode() + klh.m56830b(s571.m77243b(mt60.m62800g(this.f254770b, this.f254769a.hashCode() * 31, 31), 31, this.f254771c), 31, this.f254772d);
    }

    public wsx(int i, String str, String str2, Set set, Set set2) {
        this.f254769a = str;
        this.f254770b = i;
        this.f254771c = str2;
        this.f254772d = set;
        this.f254773e = set2;
    }
}
