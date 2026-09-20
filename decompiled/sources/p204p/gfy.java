package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class gfy extends g0b1 {

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f79485f;

    public gfy(LinkedHashMap linkedHashMap) {
        this.f79485f = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gfy) && this.f79485f.equals(((gfy) obj).f79485f);
    }

    public final int hashCode() {
        return this.f79485f.hashCode();
    }
}
