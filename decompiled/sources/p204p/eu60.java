package p204p;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class eu60 {

    /* JADX INFO: renamed from: a */
    public final KeyEvent f62887a;

    public /* synthetic */ eu60(KeyEvent keyEvent) {
        this.f62887a = keyEvent;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ eu60 m40036a(KeyEvent keyEvent) {
        return new eu60(keyEvent);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eu60) {
            return wj50.m88271j(this.f62887a, ((eu60) obj).f62887a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f62887a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f62887a + ')';
    }
}
