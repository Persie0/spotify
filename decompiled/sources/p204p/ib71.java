package p204p;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes9.dex */
public final class ib71 {

    /* JADX INFO: renamed from: a */
    public final String f100461a;

    /* JADX INFO: renamed from: b */
    public final Rect f100462b;

    /* JADX INFO: renamed from: c */
    public final Rect f100463c;

    public ib71(String str, Rect rect, Rect rect2) {
        this.f100461a = str;
        this.f100462b = rect;
        this.f100463c = rect2;
    }

    /* JADX INFO: renamed from: a */
    public final String m50170a() {
        return this.f100461a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib71)) {
            return false;
        }
        ib71 ib71Var = (ib71) obj;
        return wj50.m88271j(this.f100461a, ib71Var.f100461a) && wj50.m88271j(this.f100462b, ib71Var.f100462b) && wj50.m88271j(this.f100463c, ib71Var.f100463c);
    }

    public final int hashCode() {
        int iHashCode = this.f100461a.hashCode() * 31;
        Rect rect = this.f100462b;
        int iHashCode2 = (iHashCode + (rect == null ? 0 : rect.hashCode())) * 31;
        Rect rect2 = this.f100463c;
        return iHashCode2 + (rect2 != null ? rect2.hashCode() : 0);
    }
}
