package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class hot0 extends vpt0 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f93606a;

    public hot0(LinkedHashMap linkedHashMap) {
        this.f93606a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hot0) && this.f93606a.equals(((hot0) obj).f93606a);
    }

    public final int hashCode() {
        return this.f93606a.hashCode();
    }
}
