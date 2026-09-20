package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class efi implements ktx {

    /* JADX INFO: renamed from: a */
    public final ArrayList f59052a;

    public efi(ArrayList arrayList) {
        this.f59052a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof efi) && this.f59052a.equals(((efi) obj).f59052a);
    }

    public final int hashCode() {
        return this.f59052a.hashCode();
    }
}
