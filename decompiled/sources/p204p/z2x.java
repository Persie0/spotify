package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class z2x {

    /* JADX INFO: renamed from: a */
    public final String f278679a;

    /* JADX INFO: renamed from: b */
    public final String f278680b;

    /* JADX INFO: renamed from: c */
    public final long f278681c;

    /* JADX INFO: renamed from: d */
    public final Map f278682d;

    public z2x(String str, String str2, long j, Map map) {
        this.f278679a = str;
        this.f278680b = str2;
        this.f278681c = j;
        this.f278682d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2x)) {
            return false;
        }
        z2x z2xVar = (z2x) obj;
        return wj50.m88271j(this.f278679a, z2xVar.f278679a) && wj50.m88271j(this.f278680b, z2xVar.f278680b) && this.f278681c == z2xVar.f278681c && wj50.m88271j(this.f278682d, z2xVar.f278682d);
    }

    public final int hashCode() {
        return this.f278682d.hashCode() + dq60.m36605e(s571.m77243b(this.f278679a.hashCode() * 31, 31, this.f278680b), this.f278681c, 31);
    }
}
