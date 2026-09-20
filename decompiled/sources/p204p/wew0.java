package p204p;

import android.widget.RemoteViews;

/* JADX INFO: loaded from: classes3.dex */
public final class wew0 {

    /* JADX INFO: renamed from: a */
    public final RemoteViews f250638a;

    /* JADX INFO: renamed from: b */
    public final bx40 f250639b;

    public wew0(RemoteViews remoteViews, bx40 bx40Var) {
        this.f250638a = remoteViews;
        this.f250639b = bx40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wew0)) {
            return false;
        }
        wew0 wew0Var = (wew0) obj;
        return wj50.m88271j(this.f250638a, wew0Var.f250638a) && wj50.m88271j(this.f250639b, wew0Var.f250639b);
    }

    public final int hashCode() {
        return this.f250639b.hashCode() + (this.f250638a.hashCode() * 31);
    }

    public final String toString() {
        return "RemoteViewsInfo(remoteViews=" + this.f250638a + ", view=" + this.f250639b + ')';
    }
}
