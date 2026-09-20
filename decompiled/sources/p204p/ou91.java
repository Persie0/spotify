package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ou91 extends rt91 {

    /* JADX INFO: renamed from: d */
    public final List f170234d;

    /* JADX INFO: renamed from: e */
    public final pu91 f170235e;

    public ou91(zt91 zt91Var, st91 st91Var, long j, List list, List list2) {
        super(zt91Var, st91Var, j, list);
        this.f170234d = list2;
        this.f170235e = new pu91(this.f202551c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ou91) {
            return wj50.m88271j(this.f170235e, ((ou91) obj).f170235e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f170235e.hashCode();
    }

    @Override // p204p.rt91
    public final String toString() {
        return "impression = " + super.toString();
    }
}
