package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class u1i implements ktx {

    /* JADX INFO: renamed from: a */
    public final ArrayList f225825a;

    /* JADX INFO: renamed from: b */
    public final coo f225826b;

    /* JADX INFO: renamed from: c */
    public final coo f225827c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f225828d;

    public u1i(ArrayList arrayList, coo cooVar, coo cooVar2, ArrayList arrayList2) {
        this.f225825a = arrayList;
        this.f225826b = cooVar;
        this.f225827c = cooVar2;
        this.f225828d = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1i)) {
            return false;
        }
        u1i u1iVar = (u1i) obj;
        return this.f225825a.equals(u1iVar.f225825a) && wj50.m88271j(this.f225826b, u1iVar.f225826b) && wj50.m88271j(this.f225827c, u1iVar.f225827c) && this.f225828d.equals(u1iVar.f225828d);
    }

    public final int hashCode() {
        int iHashCode = this.f225825a.hashCode() * 31;
        coo cooVar = this.f225826b;
        int iHashCode2 = (iHashCode + (cooVar == null ? 0 : cooVar.hashCode())) * 31;
        coo cooVar2 = this.f225827c;
        return this.f225828d.hashCode() + ((iHashCode2 + (cooVar2 != null ? cooVar2.hashCode() : 0)) * 31);
    }
}
