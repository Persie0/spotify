package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class ybb0 implements zbb0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f271127a;

    public ybb0(ArrayList arrayList) {
        this.f271127a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ybb0) && this.f271127a.equals(((ybb0) obj).f271127a);
    }

    public final int hashCode() {
        return this.f271127a.hashCode();
    }
}
