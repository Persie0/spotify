package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class fmt0 extends ang1 {

    /* JADX INFO: renamed from: c */
    public final ArrayList f71120c;

    public fmt0(ArrayList arrayList) {
        this.f71120c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fmt0) && this.f71120c.equals(((fmt0) obj).f71120c);
    }

    public final int hashCode() {
        return this.f71120c.hashCode();
    }
}
