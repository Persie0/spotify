package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zu61 {

    /* JADX INFO: renamed from: a */
    public final Map f286355a;

    public zu61(Map map) {
        this.f286355a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zu61) && wj50.m88271j(this.f286355a, ((zu61) obj).f286355a);
    }

    public final int hashCode() {
        return this.f286355a.hashCode();
    }
}
