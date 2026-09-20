package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class p730 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f174553a;

    public p730(ArrayList arrayList) {
        this.f174553a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p730) && this.f174553a.equals(((p730) obj).f174553a);
    }

    public final int hashCode() {
        return this.f174553a.hashCode();
    }
}
