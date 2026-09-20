package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class sy10 implements ktx {

    /* JADX INFO: renamed from: a */
    public final ArrayList f215084a;

    public sy10(ArrayList arrayList) {
        this.f215084a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sy10) && this.f215084a.equals(((sy10) obj).f215084a);
    }

    public final int hashCode() {
        return this.f215084a.hashCode();
    }
}
