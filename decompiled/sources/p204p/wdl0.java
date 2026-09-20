package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class wdl0 implements bel0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f250305a;

    /* JADX INFO: renamed from: b */
    public final String f250306b;

    public wdl0(ArrayList arrayList, String str) {
        this.f250305a = arrayList;
        this.f250306b = str;
    }

    @Override // p204p.bel0
    /* JADX INFO: renamed from: a */
    public final String mo28945a() {
        return this.f250306b;
    }

    @Override // p204p.bel0
    /* JADX INFO: renamed from: c */
    public final List mo28946c() {
        return this.f250305a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wdl0)) {
            return false;
        }
        wdl0 wdl0Var = (wdl0) obj;
        return this.f250305a.equals(wdl0Var.f250305a) && wj50.m88271j(this.f250306b, wdl0Var.f250306b);
    }

    public final int hashCode() {
        return this.f250306b.hashCode() + (this.f250305a.hashCode() * 31);
    }
}
