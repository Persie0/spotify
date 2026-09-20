package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class odv implements qdv {

    /* JADX INFO: renamed from: a */
    public final String f164253a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f164254b;

    public odv(String str, ArrayList arrayList) {
        this.f164253a = str;
        this.f164254b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof odv)) {
            return false;
        }
        odv odvVar = (odv) obj;
        return wj50.m88271j(this.f164253a, odvVar.f164253a) && this.f164254b.equals(odvVar.f164254b);
    }

    public final int hashCode() {
        return this.f164254b.hashCode() + (this.f164253a.hashCode() * 31);
    }
}
