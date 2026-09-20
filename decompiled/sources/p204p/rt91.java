package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rt91 {

    /* JADX INFO: renamed from: a */
    public final long f202549a;

    /* JADX INFO: renamed from: b */
    public final List f202550b;

    /* JADX INFO: renamed from: c */
    public final au91 f202551c;

    public rt91(zt91 zt91Var, st91 st91Var, long j, List list) {
        this.f202549a = j;
        this.f202550b = list;
        this.f202551c = new au91(zt91Var, st91Var);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("{where=");
        au91 au91Var = this.f202551c;
        sb.append(au91Var.m27169a());
        sb.append("; parent=");
        sb.append(au91Var.m27170b());
        if (this.f202550b.isEmpty()) {
            str = "";
        } else {
            str = "; errors=" + g6f.m43753y0(this.f202550b, ";", null, null, null, 62);
        }
        sb.append(str);
        return sb.toString();
    }
}
