package p204p;

import android.content.Intent;

/* JADX INFO: renamed from: p.vo */
/* JADX INFO: loaded from: classes7.dex */
public final class C2503vo implements InterfaceC2582xo {

    /* JADX INFO: renamed from: a */
    public final Intent f243279a;

    public C2503vo(Intent intent) {
        this.f243279a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2503vo) && wj50.m88271j(this.f243279a, ((C2503vo) obj).f243279a);
    }

    public final int hashCode() {
        return this.f243279a.hashCode();
    }
}
