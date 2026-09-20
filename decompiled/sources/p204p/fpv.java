package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public final class fpv implements hpv {

    /* JADX INFO: renamed from: a */
    public final View f72005a;

    /* JADX INFO: renamed from: b */
    public final boolean f72006b;

    /* JADX INFO: renamed from: c */
    public final boolean f72007c;

    public fpv(View view, boolean z, boolean z2) {
        this.f72005a = view;
        this.f72006b = z;
        this.f72007c = z2;
    }

    @Override // p204p.hpv
    /* JADX INFO: renamed from: e */
    public final boolean mo42382e() {
        return this.f72006b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpv)) {
            return false;
        }
        fpv fpvVar = (fpv) obj;
        return wj50.m88271j(this.f72005a, fpvVar.f72005a) && this.f72006b == fpvVar.f72006b && this.f72007c == fpvVar.f72007c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f72007c) + s571.m77245d(this.f72005a.hashCode() * 31, 31, this.f72006b);
    }

    @Override // p204p.hpv
    /* JADX INFO: renamed from: i */
    public final boolean mo42383i() {
        return this.f72007c;
    }

    @Override // p204p.hpv
    /* JADX INFO: renamed from: l */
    public final View mo42384l() {
        return this.f72005a;
    }
}
