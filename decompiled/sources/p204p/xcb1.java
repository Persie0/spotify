package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class xcb1 {

    /* JADX INFO: renamed from: a */
    public final String f260191a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f260192b;

    public xcb1(String str, ArrayList arrayList) {
        this.f260191a = str;
        this.f260192b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xcb1)) {
            return false;
        }
        xcb1 xcb1Var = (xcb1) obj;
        return this.f260191a.equals(xcb1Var.f260191a) && this.f260192b.equals(xcb1Var.f260192b);
    }

    public final int hashCode() {
        return this.f260192b.hashCode() + (this.f260191a.hashCode() * 31);
    }
}
