package p204p;

import android.content.ComponentName;

/* JADX INFO: loaded from: classes11.dex */
public final class m9z extends o9z {

    /* JADX INFO: renamed from: a */
    public final ComponentName f141412a;

    public m9z(ComponentName componentName) {
        this.f141412a = componentName;
    }

    /* JADX INFO: renamed from: a */
    public final ComponentName m61232a() {
        return this.f141412a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m9z) {
            return wj50.m88271j(this.f141412a, ((m9z) obj).f141412a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f141412a.hashCode();
    }
}
