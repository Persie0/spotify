package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class bde1 extends fde1 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f26089a;

    public bde1(ArrayList arrayList) {
        this.f26089a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bde1) && this.f26089a.equals(((bde1) obj).f26089a);
    }

    public final int hashCode() {
        return this.f26089a.hashCode();
    }
}
