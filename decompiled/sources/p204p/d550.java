package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class d550 implements e550 {

    /* JADX INFO: renamed from: a */
    public final Bundle f45342a;

    public d550(Bundle bundle) {
        this.f45342a = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d550) && wj50.m88271j(this.f45342a, ((d550) obj).f45342a);
    }

    public final int hashCode() {
        return this.f45342a.hashCode();
    }
}
