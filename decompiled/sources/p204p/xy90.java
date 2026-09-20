package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class xy90 {

    /* JADX INFO: renamed from: a */
    public final String f267258a;

    /* JADX INFO: renamed from: b */
    public final String f267259b;

    /* JADX INFO: renamed from: c */
    public final String f267260c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f267261d;

    public xy90(String str, String str2, String str3, ArrayList arrayList) {
        this.f267258a = str;
        this.f267259b = str2;
        this.f267260c = str3;
        this.f267261d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xy90)) {
            return false;
        }
        xy90 xy90Var = (xy90) obj;
        return wj50.m88271j(this.f267258a, xy90Var.f267258a) && this.f267259b.equals(xy90Var.f267259b) && wj50.m88271j(this.f267260c, xy90Var.f267260c) && this.f267261d.equals(xy90Var.f267261d);
    }

    public final int hashCode() {
        return this.f267261d.hashCode() + s571.m77243b(s571.m77243b(this.f267258a.hashCode() * 31, 31, this.f267259b), 31, this.f267260c);
    }
}
