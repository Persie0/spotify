package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class dyq0 extends eyq0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f54433a;

    public dyq0(ArrayList arrayList) {
        this.f54433a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dyq0) && this.f54433a.equals(((dyq0) obj).f54433a);
    }

    public final int hashCode() {
        return this.f54433a.hashCode();
    }
}
