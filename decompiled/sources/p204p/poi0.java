package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class poi0 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f179718a;

    public /* synthetic */ poi0() {
        this(new LinkedHashMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof poi0) && wj50.m88271j(this.f179718a, ((poi0) obj).f179718a);
    }

    public final int hashCode() {
        return this.f179718a.hashCode();
    }

    public final String toString() {
        return this.f179718a.toString();
    }

    public poi0(LinkedHashMap linkedHashMap) {
        this.f179718a = linkedHashMap;
    }
}
