package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class c1x0 implements r8f {

    /* JADX INFO: renamed from: a */
    public final int f33215a;

    public c1x0(int i) {
        this.f33215a = i;
    }

    @Override // p204p.r8f
    /* JADX INFO: renamed from: a */
    public final long mo31282a(Context context) {
        return rfg1.m75432b(s8f.f206634a.m77470a(context, this.f33215a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1x0) && this.f33215a == ((c1x0) obj).f33215a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f33215a);
    }

    public final String toString() {
        return edb.m38567p(new StringBuilder("ResourceColorProvider(resId="), this.f33215a, ')');
    }
}
