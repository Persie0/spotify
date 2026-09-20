package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class bgl0 {

    /* JADX INFO: renamed from: a */
    public final String f26962a;

    /* JADX INFO: renamed from: b */
    public final String f26963b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f26964c;

    /* JADX INFO: renamed from: d */
    public final String f26965d;

    public bgl0(String str, String str2, String str3, ArrayList arrayList) {
        this.f26962a = str;
        this.f26963b = str2;
        this.f26964c = arrayList;
        this.f26965d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgl0)) {
            return false;
        }
        bgl0 bgl0Var = (bgl0) obj;
        return this.f26962a.equals(bgl0Var.f26962a) && this.f26963b.equals(bgl0Var.f26963b) && this.f26964c.equals(bgl0Var.f26964c) && wj50.m88271j(this.f26965d, bgl0Var.f26965d);
    }

    public final int hashCode() {
        int iM59700f = lq51.m59700f(this.f26964c, s571.m77243b(this.f26962a.hashCode() * 31, 31, this.f26963b), 31);
        String str = this.f26965d;
        return iM59700f + (str == null ? 0 : str.hashCode());
    }
}
