package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public final class gpv implements hpv {

    /* JADX INFO: renamed from: a */
    public final View f83251a;

    /* JADX INFO: renamed from: b */
    public final boolean f83252b;

    /* JADX INFO: renamed from: c */
    public final boolean f83253c;

    public gpv(View view, boolean z, boolean z2) {
        this.f83251a = view;
        this.f83252b = z;
        this.f83253c = z2;
    }

    @Override // p204p.hpv
    /* JADX INFO: renamed from: e */
    public final boolean mo42382e() {
        return this.f83252b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpv)) {
            return false;
        }
        gpv gpvVar = (gpv) obj;
        return wj50.m88271j(this.f83251a, gpvVar.f83251a) && this.f83252b == gpvVar.f83252b && this.f83253c == gpvVar.f83253c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f83253c) + s571.m77245d(this.f83251a.hashCode() * 31, 31, this.f83252b);
    }

    @Override // p204p.hpv
    /* JADX INFO: renamed from: i */
    public final boolean mo42383i() {
        return this.f83253c;
    }

    @Override // p204p.hpv
    /* JADX INFO: renamed from: l */
    public final View mo42384l() {
        return this.f83251a;
    }
}
