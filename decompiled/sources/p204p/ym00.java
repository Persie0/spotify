package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class ym00 extends an00 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f274129a;

    public ym00(ArrayList arrayList) {
        this.f274129a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ym00) && this.f274129a.equals(((ym00) obj).f274129a);
    }

    public final int hashCode() {
        return this.f274129a.hashCode();
    }
}
