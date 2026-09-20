package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class oev {

    /* JADX INFO: renamed from: a */
    public final String f164563a;

    /* JADX INFO: renamed from: b */
    public final List f164564b;

    public oev(String str, List list) {
        this.f164563a = str;
        this.f164564b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oev)) {
            return false;
        }
        oev oevVar = (oev) obj;
        return wj50.m88271j(this.f164563a, oevVar.f164563a) && wj50.m88271j(this.f164564b, oevVar.f164564b);
    }

    public final int hashCode() {
        return this.f164564b.hashCode() + (this.f164563a.hashCode() * 31);
    }
}
