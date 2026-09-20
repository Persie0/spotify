package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class qie0 implements ktx {

    /* JADX INFO: renamed from: a */
    public final ArrayList f189005a;

    public qie0(ArrayList arrayList) {
        this.f189005a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qie0) && this.f189005a.equals(((qie0) obj).f189005a);
    }

    public final int hashCode() {
        return this.f189005a.hashCode();
    }
}
