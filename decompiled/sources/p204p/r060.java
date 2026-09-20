package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class r060 implements s060 {

    /* JADX INFO: renamed from: a */
    public final Context f194392a;

    public r060(Context context) {
        this.f194392a = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r060) && wj50.m88271j(this.f194392a, ((r060) obj).f194392a);
    }

    public final int hashCode() {
        return this.f194392a.hashCode();
    }
}
