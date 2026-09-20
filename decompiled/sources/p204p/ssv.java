package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ssv {

    /* JADX INFO: renamed from: a */
    public final String f213717a;

    /* JADX INFO: renamed from: b */
    public final Object f213718b;

    /* JADX INFO: renamed from: c */
    public final String f213719c;

    /* JADX INFO: renamed from: d */
    public final boolean f213720d;

    public ssv(String str, String str2, List list, boolean z) {
        this.f213717a = str;
        this.f213718b = list;
        this.f213719c = str2;
        this.f213720d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssv)) {
            return false;
        }
        ssv ssvVar = (ssv) obj;
        return wj50.m88271j(this.f213717a, ssvVar.f213717a) && this.f213718b.equals(ssvVar.f213718b) && wj50.m88271j(this.f213719c, ssvVar.f213719c) && this.f213720d == ssvVar.f213720d;
    }

    public final int hashCode() {
        int iM36604d = dq60.m36604d(this.f213717a.hashCode() * 31, 31, this.f213718b);
        String str = this.f213719c;
        return Boolean.hashCode(this.f213720d) + ((iM36604d + (str == null ? 0 : str.hashCode())) * 31);
    }
}
