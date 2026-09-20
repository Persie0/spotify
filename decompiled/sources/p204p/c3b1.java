package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class c3b1 extends ov50 {

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f33641e;

    public c3b1(LinkedHashMap linkedHashMap) {
        super(6, 7);
        this.f33641e = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c3b1) && this.f33641e.equals(((c3b1) obj).f33641e);
    }

    public final int hashCode() {
        return this.f33641e.hashCode();
    }
}
