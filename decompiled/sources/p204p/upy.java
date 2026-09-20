package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class upy {

    /* JADX INFO: renamed from: a */
    public final ArrayList f232842a;

    public upy(ArrayList arrayList) {
        this.f232842a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof upy) && this.f232842a.equals(((upy) obj).f232842a);
    }

    public final int hashCode() {
        return this.f232842a.hashCode();
    }
}
