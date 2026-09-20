package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class mel {

    /* JADX INFO: renamed from: a */
    public final int f142752a;

    /* JADX INFO: renamed from: b */
    public final View f142753b;

    /* JADX INFO: renamed from: c */
    public final View f142754c;

    /* JADX INFO: renamed from: d */
    public final View f142755d;

    /* JADX INFO: renamed from: e */
    public final View f142756e;

    /* JADX INFO: renamed from: f */
    public final View f142757f;

    /* JADX INFO: renamed from: g */
    public final View f142758g;

    public mel(int i, View view, View view2, View view3, View view4, View view5, View view6) {
        this.f142752a = i;
        this.f142753b = view;
        this.f142754c = view2;
        this.f142755d = view3;
        this.f142756e = view4;
        this.f142757f = view5;
        this.f142758g = view6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mel)) {
            return false;
        }
        mel melVar = (mel) obj;
        return this.f142752a == melVar.f142752a && wj50.m88271j(this.f142753b, melVar.f142753b) && wj50.m88271j(this.f142754c, melVar.f142754c) && wj50.m88271j(this.f142755d, melVar.f142755d) && wj50.m88271j(this.f142756e, melVar.f142756e) && wj50.m88271j(this.f142757f, melVar.f142757f) && wj50.m88271j(this.f142758g, melVar.f142758g);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f142752a) * 31;
        View view = this.f142753b;
        int iHashCode2 = (iHashCode + (view == null ? 0 : view.hashCode())) * 31;
        View view2 = this.f142754c;
        int iHashCode3 = (iHashCode2 + (view2 == null ? 0 : view2.hashCode())) * 31;
        View view3 = this.f142755d;
        int iHashCode4 = (iHashCode3 + (view3 == null ? 0 : view3.hashCode())) * 31;
        View view4 = this.f142756e;
        int iHashCode5 = (iHashCode4 + (view4 == null ? 0 : view4.hashCode())) * 31;
        View view5 = this.f142757f;
        int iHashCode6 = (iHashCode5 + (view5 == null ? 0 : view5.hashCode())) * 31;
        View view6 = this.f142758g;
        return iHashCode6 + (view6 != null ? view6.hashCode() : 0);
    }
}
