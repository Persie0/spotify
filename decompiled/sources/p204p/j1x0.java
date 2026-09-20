package p204p;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes2.dex */
public final class j1x0 implements h1x0 {

    /* JADX INFO: renamed from: a */
    public final int f107881a;

    public j1x0(int i) {
        this.f107881a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j1x0) {
            return this.f107881a == ((j1x0) obj).f107881a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f107881a;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        Resources resources = (Resources) obj;
        int i = this.f107881a;
        String string = i != 0 ? resources.getString(i) : "";
        wj50.m88279p(string);
        return string;
    }
}
